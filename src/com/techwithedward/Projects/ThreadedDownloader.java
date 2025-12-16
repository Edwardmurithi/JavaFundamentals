package com.techwithedward.Projects;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class ThreadedDownloader {
    private static final int MAX_THREADS = 5;
    private static final ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);
    private static final Map<String, DownloadTask> activeDownloads = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Threaded Download Manager ===");
        System.out.println("Commands: ADD, LIST, PAUSE, RESUME, CANCEL, STATUS, EXIT");

        while (true) {
            System.out.print("\nDownloader> ");
            String command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "ADD" -> {
                    System.out.print("URL to download: ");
                    String url = scanner.nextLine();
                    System.out.print("Save as (filename): ");
                    String filename = scanner.nextLine();
                    addDownload(url, filename);
                }
                case "LIST" -> listDownloads();
                case "PAUSE" -> {
                    System.out.print("Download ID: ");
                    String id = scanner.nextLine();
                    pauseDownload(id);
                }
                case "RESUME" -> {
                    System.out.print("Download ID: ");
                    String id = scanner.nextLine();
                    resumeDownload(id);
                }
                case "CANCEL" -> {
                    System.out.print("Download ID: ");
                    String id = scanner.nextLine();
                    cancelDownload(id);
                }
                case "STATUS" -> {
                    System.out.print("Download ID (or ALL): ");
                    String id = scanner.nextLine();
                    showStatus(id);
                }
                case "EXIT" -> {
                    shutdown();
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Unknown command!");
            }
        }
    }

    private static void addDownload(String urlString, String filename) {
        String id = UUID.randomUUID().toString().substring(0, 8);
        DownloadTask task = new DownloadTask(id, urlString, filename);
        activeDownloads.put(id, task);

        Future<?> future = executor.submit(task);
        task.setFuture(future);

        System.out.println("Download added with ID: " + id);
    }

    private static void listDownloads() {
        if (activeDownloads.isEmpty()) {
            System.out.println("No active downloads.");
            return;
        }

        System.out.println("\n=== Active Downloads ===");
        System.out.printf("%-10s %-40s %-20s %-10s\n", "ID", "URL", "Filename", "Status");
        System.out.println("-".repeat(85));

        for (DownloadTask task : activeDownloads.values()) {
            System.out.printf("%-10s %-40s %-20s %-10s\n",
                    task.getId(),
                    task.getUrl().length() > 40 ? task.getUrl().substring(0, 37) + "..." : task.getUrl(),
                    task.getFilename(),
                    task.getStatus());
        }
    }

    private static void pauseDownload(String id) {
        DownloadTask task = activeDownloads.get(id);
        if (task != null) {
            task.pause();
            System.out.println("Download " + id + " paused.");
        } else {
            System.out.println("Download not found!");
        }
    }

    private static void resumeDownload(String id) {
        DownloadTask task = activeDownloads.get(id);
        if (task != null) {
            task.resume();
            System.out.println("Download " + id + " resumed.");
        } else {
            System.out.println("Download not found!");
        }
    }

    private static void cancelDownload(String id) {
        DownloadTask task = activeDownloads.get(id);
        if (task != null) {
            task.cancel();
            activeDownloads.remove(id);
            System.out.println("Download " + id + " cancelled.");
        } else {
            System.out.println("Download not found!");
        }
    }

    private static void showStatus(String id) {
        if (id.equalsIgnoreCase("ALL")) {
            for (DownloadTask task : activeDownloads.values()) {
                System.out.println(task.getDetailedStatus());
            }
        } else {
            DownloadTask task = activeDownloads.get(id);
            if (task != null) {
                System.out.println(task.getDetailedStatus());
            } else {
                System.out.println("Download not found!");
            }
        }
    }

    private static void shutdown() {
        System.out.println("Shutting down download manager...");

        // Cancel all downloads
        for (DownloadTask task : activeDownloads.values()) {
            task.cancel();
        }

        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}

class DownloadTask implements Runnable {
    private final String id;
    private final String url;
    private final String filename;
    private volatile boolean paused = false;
    private volatile boolean cancelled = false;
    private volatile DownloadStatus status = DownloadStatus.QUEUED;
    private volatile long bytesDownloaded = 0;
    private volatile long totalBytes = 0;
    private volatile double downloadSpeed = 0;
    private Future<?> future;

    public DownloadTask(String id, String url, String filename) {
        this.id = id;
        this.url = url;
        this.filename = filename;
    }

    public void setFuture(Future<?> future) {
        this.future = future;
    }

    @Override
    public void run() {
        status = DownloadStatus.DOWNLOADING;

        try {
            URL downloadUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) downloadUrl.openConnection();

            // Get file size
            totalBytes = connection.getContentLengthLong();

            try (
                    InputStream in = new BufferedInputStream(connection.getInputStream());
                    FileOutputStream out = new FileOutputStream(filename)
            ) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                long startTime = System.currentTimeMillis();

                while ((bytesRead = in.read(buffer)) != -1) {
                    if (cancelled) {
                        status = DownloadStatus.CANCELLED;
                        cleanup();
                        return;
                    }

                    while (paused) {
                        if (cancelled) {
                            status = DownloadStatus.CANCELLED;
                            cleanup();
                            return;
                        }
                        Thread.sleep(100);
                    }

                    out.write(buffer, 0, bytesRead);
                    bytesDownloaded += bytesRead;

                    // Calculate download speed every second
                    long currentTime = System.currentTimeMillis();
                    if (currentTime - startTime >= 1000) {
                        double elapsedSeconds = (currentTime - startTime) / 1000.0;
                        downloadSpeed = bytesDownloaded / elapsedSeconds;
                        startTime = currentTime;
                    }
                }

                status = DownloadStatus.COMPLETED;
                System.out.println("Download " + id + " completed successfully!");

            } catch (IOException e) {
                status = DownloadStatus.FAILED;
                System.out.println("Download " + id + " failed: " + e.getMessage());
                cleanup();
            }

        } catch (Exception e) {
            status = DownloadStatus.FAILED;
            System.out.println("Download " + id + " failed: " + e.getMessage());
            cleanup();
        }
    }

    private void cleanup() {
        if (status == DownloadStatus.FAILED || status == DownloadStatus.CANCELLED) {
            File file = new File(filename);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public void pause() {
        paused = true;
        status = DownloadStatus.PAUSED;
    }

    public void resume() {
        paused = false;
        status = DownloadStatus.DOWNLOADING;
    }

    public void cancel() {
        cancelled = true;
        if (future != null) {
            future.cancel(true);
        }
        status = DownloadStatus.CANCELLED;
        cleanup();
    }

    // Getters
    public String getId() { return id; }
    public String getUrl() { return url; }
    public String getFilename() { return filename; }
    public String getStatus() { return status.toString(); }

    public String getDetailedStatus() {
        double percent = totalBytes > 0 ? (bytesDownloaded * 100.0 / totalBytes) : 0;
        String speedStr = downloadSpeed > 0 ?
                String.format("%.2f KB/s", downloadSpeed / 1024) : "N/A";

        return String.format(
                "ID: %s\nURL: %s\nFile: %s\nStatus: %s\nProgress: %d/%d bytes (%.1f%%)\nSpeed: %s\n",
                id, url, filename, status, bytesDownloaded, totalBytes, percent, speedStr
        );
    }
}

enum DownloadStatus {
    QUEUED, DOWNLOADING, PAUSED, COMPLETED, FAILED, CANCELLED
}
