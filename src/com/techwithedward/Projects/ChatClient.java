package com.techwithedward.Projects;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (
                Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("Connected to chat server!");

            // Start a thread to receive messages
            new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server");
                }
            }).start();

            // Send messages
            String userInput;
            while (true) {
                userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("/exit")) {
                    out.println("/exit");
                    break;
                }
                out.println(userInput);
            }

        } catch (IOException e) {
            System.out.println("Unable to connect to server");
        }
    }
}