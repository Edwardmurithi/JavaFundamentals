package com.techwithedward.Projects.TaskManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "tasks.txt";
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> tasks = new ArrayList<String>();

    static void main() {
        while (true) {
            System.out.println("\n*******TASK MANAGER******");
            System.out.println("\t--Press Q to quit\n");
            System.out.println("1. Add new Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Mark Task Complete");
            System.out.println("5. Search Tasks");
            System.out.println("6. Delete Tasks");
            System.out.println("7. Save and Exit.");

            System.out.print("\nSelect the Option: ");

            try {
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1 -> addTask();
                    case 2 -> viewTask();
                    case 3 -> updateTask();
                    case 4 -> markComplete();
                    case 5 -> searchTask();
                    case 6 -> deleteTask();
                    case 7 -> saveTask();
                    default -> System.out.println("Invalid Option!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please Enter a valid number");
            }
        }
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void  pauseAndReturn() {

    }

    public static void loadTasks() {

    }

    public static void addTask() {
        try {
            System.out.print("Enter Task:");
            String task = scanner.nextLine();
            tasks.add(task);
        } catch (Exception e) {
            System.out.println("An error Occurred");
        }
    }

    public static void viewTask() {
        System.out.println("Coming Soon");
    }

    public static void updateTask() {
        System.out.println("Coming Soon");
        clearConsole();
    }

    public static void markComplete() {
        System.out.println("Coming Soon");
    }

    public static void searchTask() {
        System.out.println("Coming Soon");
    }

    public static void deleteTask() {
        System.out.println("Coming Soon");
    }

    public static void saveTask() {
        System.out.println("Coming Soon!");
    }
}
