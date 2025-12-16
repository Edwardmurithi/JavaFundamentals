package com.techwithedward.Projects;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TaskManager {
    private static final String FILE_NAME = "tasks.txt";
    private static List<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadTasks();

        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Search Tasks");
            System.out.println("6. Save and Exit");
            System.out.print("Choose option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> addTask();
                    case 2 -> viewTasks();
                    case 3 -> markComplete();
                    case 4 -> deleteTask();
                    case 5 -> searchTasks();
                    case 6 -> {
                        saveTasks();
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid option!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter priority (1-Low, 2-Medium, 3-High): ");
        int priority = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        Task task = new Task(description, priority, category, false);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n=== Your Tasks ===");
        System.out.printf("%-5s %-40s %-10s %-15s %-10s\n",
                "ID", "Description", "Priority", "Category", "Status");
        System.out.println("-".repeat(85));

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.isCompleted() ? "✓ Done" : "✗ Pending";
            String priorityStr = switch(task.getPriority()) {
                case 1 -> "Low";
                case 2 -> "Medium";
                case 3 -> "High";
                default -> "Unknown";
            };

            System.out.printf("%-5d %-40s %-10s %-15s %-10s\n",
                    i + 1,
                    task.getDescription().length() > 40 ?
                            task.getDescription().substring(0, 37) + "..." :
                            task.getDescription(),
                    priorityStr,
                    task.getCategory(),
                    status);
        }
    }

    private static void markComplete() {
        viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("Enter task ID to mark complete: ");
        try {
            int id = Integer.parseInt(scanner.nextLine()) - 1;
            if (id >= 0 && id < tasks.size()) {
                tasks.get(id).setCompleted(true);
                System.out.println("Task marked as complete!");
            } else {
                System.out.println("Invalid ID!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number!");
        }
    }

    private static void deleteTask() {
        viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("Enter task ID to delete: ");
        try {
            int id = Integer.parseInt(scanner.nextLine()) - 1;
            if (id >= 0 && id < tasks.size()) {
                tasks.remove(id);
                System.out.println("Task deleted!");
            } else {
                System.out.println("Invalid ID!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number!");
        }
    }

    private static void searchTasks() {
        System.out.print("Enter search term: ");
        String term = scanner.nextLine().toLowerCase();

        List<Task> results = tasks.stream()
                .filter(task -> task.getDescription().toLowerCase().contains(term) ||
                        task.getCategory().toLowerCase().contains(term))
                .toList();

        if (results.isEmpty()) {
            System.out.println("No matching tasks found.");
            return;
        }

        System.out.println("\n=== Search Results ===");
        for (Task task : results) {
            System.out.println("- " + task.getDescription() +
                    " [" + task.getCategory() + "] " +
                    (task.isCompleted() ? "(Completed)" : "(Pending)"));
        }
    }

    private static void loadTasks() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            for (String line : lines) {
                Task task = Task.fromString(line);
                if (task != null) {
                    tasks.add(task);
                }
            }
            System.out.println("Loaded " + tasks.size() + " tasks from file.");
        } catch (IOException e) {
            System.out.println("No existing tasks file found. Starting fresh.");
        }
    }

    private static void saveTasks() {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            for (Task task : tasks) {
                writer.println(task.toString());
            }
            System.out.println("Tasks saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }
}

class Task {
    private String description;
    private int priority;
    private String category;
    private boolean completed;
    private LocalDateTime createdAt;

    public Task(String description, int priority, String category, boolean completed) {
        this.description = description;
        this.priority = priority;
        this.category = category;
        this.completed = completed;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters
    public String getDescription() { return description; }
    public int getPriority() { return priority; }
    public String getCategory() { return category; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return String.join("|",
                description,
                String.valueOf(priority),
                category,
                String.valueOf(completed),
                createdAt.format(formatter));
    }

    public static Task fromString(String str) {
        try {
            String[] parts = str.split("\\|");
            if (parts.length == 5) {
                String description = parts[0];
                int priority = Integer.parseInt(parts[1]);
                String category = parts[2];
                boolean completed = Boolean.parseBoolean(parts[3]);
                Task task = new Task(description, priority, category, completed);
                // Note: createdAt is set to now in constructor
                return task;
            }
        } catch (Exception e) {
            System.out.println("Error parsing task: " + e.getMessage());
        }
        return null;
    }
}
