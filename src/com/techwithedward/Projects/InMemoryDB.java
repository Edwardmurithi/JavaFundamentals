package com.techwithedward.Projects;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDB {
    private Map<String, Map<String, Object>> tables = new ConcurrentHashMap<>();
    private Map<String, Set<String>> indexes = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        InMemoryDB db = new InMemoryDB();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== In-Memory Database ===");
        System.out.println("Commands: CREATE, INSERT, SELECT, UPDATE, DELETE, INDEX, EXIT");

        while (true) {
            System.out.print("\nDB> ");
            String command = scanner.nextLine().trim().toUpperCase();

            try {
                switch (command) {
                    case "CREATE" -> {
                        System.out.print("Table name: ");
                        String tableName = scanner.nextLine();
                        System.out.print("Columns (comma-separated): ");
                        String[] columns = scanner.nextLine().split(",");
                        db.createTable(tableName, columns);
                    }
                    case "INSERT" -> {
                        System.out.print("Table name: ");
                        String tableName = scanner.nextLine();
                        System.out.print("Values (comma-separated): ");
                        String[] values = scanner.nextLine().split(",");
                        db.insert(tableName, values);
                    }
                    case "SELECT" -> {
                        System.out.print("Table name: ");
                        String tableName = scanner.nextLine();
                        System.out.print("WHERE clause (col=value) or ALL: ");
                        String where = scanner.nextLine();
                        db.select(tableName, where);
                    }
                    case "UPDATE" -> {
                        System.out.print("Table name: ");
                        String tableName = scanner.nextLine();
                        System.out.print("SET clause (col=value): ");
                        String set = scanner.nextLine();
                        System.out.print("WHERE clause (col=value): ");
                        String where = scanner.nextLine();
                        db.update(tableName, set, where);
                    }
                    case "DELETE" -> {
                        System.out.print("Table name: ");
                        String tableName = scanner.nextLine();
                        System.out.print("WHERE clause (col=value) or ALL: ");
                        String where = scanner.nextLine();
                        db.delete(tableName, where);
                    }
                    case "INDEX" -> {
                        System.out.print("Table name: ");
                        String tableName = scanner.nextLine();
                        System.out.print("Column to index: ");
                        String column = scanner.nextLine();
                        db.createIndex(tableName, column);
                    }
                    case "EXIT" -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Unknown command!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void createTable(String tableName, String[] columns) {
        if (tables.containsKey(tableName)) {
            throw new IllegalArgumentException("Table already exists!");
        }

        Map<String, Object> schema = new HashMap<>();
        for (String col : columns) {
            schema.put(col.trim(), null);
        }

        tables.put(tableName, new ConcurrentHashMap<>());
        System.out.println("Table '" + tableName + "' created with columns: " + Arrays.toString(columns));
    }

    public void insert(String tableName, String[] values) {
        Map<String, Object> table = tables.get(tableName);
        if (table == null) {
            throw new IllegalArgumentException("Table not found!");
        }

        String id = UUID.randomUUID().toString();
        Map<String, Object> record = new HashMap<>();

        // Simple mapping - in real DB, you'd need schema info
        for (int i = 0; i < values.length; i++) {
            record.put("col" + (i + 1), values[i].trim());
        }

        table.put(id, record);

        // Update indexes
        updateIndexes(tableName, id, record);

        System.out.println("Inserted record with ID: " + id);
    }

    public void select(String tableName, String where) {
        Map<String, Object> table = tables.get(tableName);
        if (table == null) {
            throw new IllegalArgumentException("Table not found!");
        }

        System.out.println("\n=== Results from '" + tableName + "' ===");

        if (where.equalsIgnoreCase("ALL")) {
            for (Map.Entry<String, Object> entry : table.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
            }
        } else {
            String[] conditions = where.split("=");
            if (conditions.length == 2) {
                String col = conditions[0].trim();
                String value = conditions[1].trim();

                // Use index if available
                String indexKey = tableName + "." + col;
                if (indexes.containsKey(indexKey)) {
                    // This is simplified - real implementation would be more complex
                    for (Map.Entry<String, Object> entry : table.entrySet()) {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> record = (Map<String, Object>) entry.getValue();
                        if (record.containsKey(col) && record.get(col).equals(value)) {
                            System.out.println("ID: " + entry.getKey() + " -> " + record);
                        }
                    }
                } else {
                    // Full scan
                    for (Map.Entry<String, Object> entry : table.entrySet()) {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> record = (Map<String, Object>) entry.getValue();
                        if (record.containsKey(col) && record.get(col).equals(value)) {
                            System.out.println("ID: " + entry.getKey() + " -> " + record);
                        }
                    }
                }
            }
        }
        System.out.println("Total records: " + table.size());
    }

    public void update(String tableName, String set, String where) {
        Map<String, Object> table = tables.get(tableName);
        if (table == null) {
            throw new IllegalArgumentException("Table not found!");
        }

        String[] setParts = set.split("=");
        String[] whereParts = where.split("=");

        if (setParts.length != 2 || whereParts.length != 2) {
            throw new IllegalArgumentException("Invalid syntax!");
        }

        String setCol = setParts[0].trim();
        String setValue = setParts[1].trim();
        String whereCol = whereParts[0].trim();
        String whereValue = whereParts[1].trim();

        int count = 0;
        for (Map.Entry<String, Object> entry : table.entrySet()) {
            @SuppressWarnings("unchecked")
            Map<String, Object> record = (Map<String, Object>) entry.getValue();

            if (record.containsKey(whereCol) && record.get(whereCol).equals(whereValue)) {
                // Remove old index entries
                removeFromIndexes(tableName, entry.getKey(), record);

                // Update record
                record.put(setCol, setValue);

                // Add new index entries
                updateIndexes(tableName, entry.getKey(), record);

                count++;
            }
        }

        System.out.println("Updated " + count + " records");
    }

    public void delete(String tableName, String where) {
        Map<String, Object> table = tables.get(tableName);
        if (table == null) {
            throw new IllegalArgumentException("Table not found!");
        }

        if (where.equalsIgnoreCase("ALL")) {
            int size = table.size();
            table.clear();
            indexes.clear();
            System.out.println("Deleted all " + size + " records");
            return;
        }

        String[] conditions = where.split("=");
        if (conditions.length != 2) {
            throw new IllegalArgumentException("Invalid syntax!");
        }

        String col = conditions[0].trim();
        String value = conditions[1].trim();

        int count = 0;
        List<String> toRemove = new ArrayList<>();

        for (Map.Entry<String, Object> entry : table.entrySet()) {
            @SuppressWarnings("unchecked")
            Map<String, Object> record = (Map<String, Object>) entry.getValue();

            if (record.containsKey(col) && record.get(col).equals(value)) {
                // Remove from indexes
                removeFromIndexes(tableName, entry.getKey(), record);
                toRemove.add(entry.getKey());
                count++;
            }
        }

        toRemove.forEach(table::remove);
        System.out.println("Deleted " + count + " records");
    }

    public void createIndex(String tableName, String column) {
        String indexKey = tableName + "." + column;
        indexes.put(indexKey, new HashSet<>());

        Map<String, Object> table = tables.get(tableName);
        if (table != null) {
            for (Map.Entry<String, Object> entry : table.entrySet()) {
                @SuppressWarnings("unchecked")
                Map<String, Object> record = (Map<String, Object>) entry.getValue();
                if (record.containsKey(column)) {
                    indexes.get(indexKey).add(entry.getKey());
                }
            }
        }

        System.out.println("Created index on " + indexKey);
    }

    private void updateIndexes(String tableName, String recordId, Map<String, Object> record) {
        for (String indexKey : indexes.keySet()) {
            if (indexKey.startsWith(tableName + ".")) {
                String column = indexKey.substring(indexKey.indexOf(".") + 1);
                if (record.containsKey(column) && record.get(column) != null) {
                    indexes.get(indexKey).add(recordId);
                }
            }
        }
    }

    private void removeFromIndexes(String tableName, String recordId, Map<String, Object> record) {
        for (String indexKey : indexes.keySet()) {
            if (indexKey.startsWith(tableName + ".")) {
                indexes.get(indexKey).remove(recordId);
            }
        }
    }
}