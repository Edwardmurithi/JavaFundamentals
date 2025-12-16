package com.techwithedward.Projects;

import com.sun.net.httpserver.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

public class LightweightAPIServer {
    private HttpServer server;
    private Map<String, Map<String, Route>> routes;
    private Map<String, Object> dataStore;
    private int requestCount;

    public LightweightAPIServer(int port) throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        routes = new ConcurrentHashMap<>();
        dataStore = new ConcurrentHashMap<>();
        requestCount = 0;

        // Use a thread pool
        server.setExecutor(Executors.newFixedThreadPool(10));

        // Root handler that routes requests
        server.createContext("/", this::handleRequest);
    }

    // Route registration methods
    public void get(String path, RouteHandler handler) {
        addRoute("GET", path, handler);
    }

    public void post(String path, RouteHandler handler) {
        addRoute("POST", path, handler);
    }

    public void put(String path, RouteHandler handler) {
        addRoute("PUT", path, handler);
    }

    public void delete(String path, RouteHandler handler) {
        addRoute("DELETE", path, handler);
    }

    private void addRoute(String method, String path, RouteHandler handler) {
        routes.computeIfAbsent(method, k -> new ConcurrentHashMap<>())
                .put(path, new Route(path, handler));
    }

    private void handleRequest(HttpExchange exchange) throws IOException {
        requestCount++;
        String method = exchange.getRequestMethod();
        String path = exchange.getRequestURI().getPath();

        System.out.println("[" + requestCount + "] " + method + " " + path);

        try {
            // Find matching route
            Map<String, Route> methodRoutes = routes.get(method);
            if (methodRoutes == null) {
                sendResponse(exchange, 404, "{\"error\": \"Not found\"}");
                return;
            }

            Route route = findMatchingRoute(methodRoutes, path);
            if (route == null) {
                sendResponse(exchange, 404, "{\"error\": \"Not found\"}");
                return;
            }

            // Create request/response objects
            Request req = new Request(exchange, route.extractParams(path));
            Response res = new Response(exchange);

            // Execute handler
            route.handler.handle(req, res);

        } catch (Exception e) {
            e.printStackTrace();
            sendResponse(exchange, 500, "{\"error\": \"Internal server error\"}");
        }
    }

    private Route findMatchingRoute(Map<String, Route> routes, String path) {
        // Exact match first
        if (routes.containsKey(path)) {
            return routes.get(path);
        }

        // Pattern match
        for (Route route : routes.values()) {
            if (route.matches(path)) {
                return route;
            }
        }

        return null;
    }

    private void sendResponse(HttpExchange exchange, int code, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.sendResponseHeaders(code, bytes.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(bytes);
        }
    }

    public void start() {
        server.start();
        System.out.println("Server started on port " + server.getAddress().getPort());
    }

    public void stop() {
        server.stop(0);
        System.out.println("Server stopped");
    }

    // Request class
    public static class Request {
        private HttpExchange exchange;
        private Map<String, String> params;
        private String body;

        public Request(HttpExchange exchange, Map<String, String> params) throws IOException {
            this.exchange = exchange;
            this.params = params;

            // Read body
            InputStream is = exchange.getRequestBody();
            this.body = new String(is.readAllBytes(), StandardCharsets.UTF_8);
        }

        public String getParam(String key) {
            return params.get(key);
        }

        public String getBody() {
            return body;
        }

        public Map<String, String> getQueryParams() {
            String query = exchange.getRequestURI().getQuery();
            Map<String, String> params = new HashMap<>();

            if (query != null) {
                for (String param : query.split("&")) {
                    String[] pair = param.split("=");
                    if (pair.length == 2) {
                        params.put(pair[0], URLDecoder.decode(pair[1], StandardCharsets.UTF_8));
                    }
                }
            }

            return params;
        }
    }

    // Response class
    public static class Response {
        private HttpExchange exchange;
        private boolean sent;

        public Response(HttpExchange exchange) {
            this.exchange = exchange;
            this.sent = false;
        }

        public void json(Object obj) throws IOException {
            json(200, obj.toString());
        }

        public void json(int code, String json) throws IOException {
            if (sent) return;
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(code, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
            sent = true;
        }

        public void send(String text) throws IOException {
            send(200, text);
        }

        public void send(int code, String text) throws IOException {
            if (sent) return;
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(code, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
            sent = true;
        }
    }

    // Route handler interface
    @FunctionalInterface
    public interface RouteHandler {
        void handle(Request req, Response res) throws IOException;
    }

    // Route class with path parameter support
    static class Route {
        String pattern;
        RouteHandler handler;
        List<String> paramNames;

        Route(String pattern, RouteHandler handler) {
            this.pattern = pattern;
            this.handler = handler;
            this.paramNames = extractParamNames(pattern);
        }

        private List<String> extractParamNames(String pattern) {
            List<String> names = new ArrayList<>();
            String[] parts = pattern.split("/");
            for (String part : parts) {
                if (part.startsWith(":")) {
                    names.add(part.substring(1));
                }
            }
            return names;
        }

        boolean matches(String path) {
            String[] patternParts = pattern.split("/");
            String[] pathParts = path.split("/");

            if (patternParts.length != pathParts.length) return false;

            for (int i = 0; i < patternParts.length; i++) {
                if (!patternParts[i].startsWith(":") && !patternParts[i].equals(pathParts[i])) {
                    return false;
                }
            }
            return true;
        }

        Map<String, String> extractParams(String path) {
            Map<String, String> params = new HashMap<>();
            String[] patternParts = pattern.split("/");
            String[] pathParts = path.split("/");

            for (int i = 0; i < patternParts.length; i++) {
                if (patternParts[i].startsWith(":")) {
                    String paramName = patternParts[i].substring(1);
                    params.put(paramName, pathParts[i]);
                }
            }
            return params;
        }
    }

    // Demo usage
    public static void main(String[] args) {
        try {
            LightweightAPIServer api = new LightweightAPIServer(8080);
            Map<Integer, Map<String, Object>> users = new ConcurrentHashMap<>();
            AtomicInteger userId = new AtomicInteger(1);

            // Health check
            api.get("/health", (req, res) -> {
                res.json("{\"status\": \"healthy\"}");
            });

            // Get all users
            api.get("/api/users", (req, res) -> {
                StringBuilder json = new StringBuilder("[");
                int i = 0;
                for (Map<String, Object> user : users.values()) {
                    if (i++ > 0) json.append(",");
                    json.append("{\"id\":").append(user.get("id"))
                            .append(",\"name\":\"").append(user.get("name")).append("\"}");
                }
                json.append("]");
                res.json(json.toString());
            });

            // Get user by ID
            api.get("/api/users/:id", (req, res) -> {
                int id = Integer.parseInt(req.getParam("id"));
                Map<String, Object> user = users.get(id);

                if (user == null) {
                    res.json(404, "{\"error\": \"User not found\"}");
                } else {
                    String json = "{\"id\":" + user.get("id") +
                            ",\"name\":\"" + user.get("name") + "\"}";
                    res.json(json);
                }
            });

            // Create user
            api.post("/api/users", (req, res) -> {
                int id = userId.getAndIncrement();
                String body = req.getBody();

                // Simple JSON parsing (for demo - use a library for production)
                String name = body.replaceAll(".*\"name\"\\s*:\\s*\"([^\"]+)\".*", "$1");

                Map<String, Object> user = new HashMap<>();
                user.put("id", id);
                user.put("name", name);
                users.put(id, user);

                String json = "{\"id\":" + id + ",\"name\":\"" + name + "\"}";
                res.json(201, json);
            });

            // Update user
            api.put("/api/users/:id", (req, res) -> {
                int id = Integer.parseInt(req.getParam("id"));
                Map<String, Object> user = users.get(id);

                if (user == null) {
                    res.json(404, "{\"error\": \"User not found\"}");
                    return;
                }

                String body = req.getBody();
                String name = body.replaceAll(".*\"name\"\\s*:\\s*\"([^\"]+)\".*", "$1");
                user.put("name", name);

                String json = "{\"id\":" + id + ",\"name\":\"" + name + "\"}";
                res.json(json);
            });

            // Delete user
            api.delete("/api/users/:id", (req, res) -> {
                int id = Integer.parseInt(req.getParam("id"));

                if (users.remove(id) != null) {
                    res.json("{\"message\": \"User deleted\"}");
                } else {
                    res.json(404, "{\"error\": \"User not found\"}");
                }
            });

            api.start();

            System.out.println("\nAPI Endpoints:");
            System.out.println("GET    http://localhost:8080/health");
            System.out.println("GET    http://localhost:8080/api/users");
            System.out.println("GET    http://localhost:8080/api/users/:id");
            System.out.println("POST   http://localhost:8080/api/users");
            System.out.println("PUT    http://localhost:8080/api/users/:id");
            System.out.println("DELETE http://localhost:8080/api/users/:id");

            System.out.println("\nPress Enter to stop server...");
            new Scanner(System.in).nextLine();

            api.stop();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}