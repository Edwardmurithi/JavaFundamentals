package com.techwithedward.Projects.GuessGame;

import java.util.Scanner;

public class NumberGuessGame {
    private final GameConfig config;
    private final Scanner scanner;
    private final int secreteNumber;
    private final Player player;

    public NumberGuessGame(GameConfig config) {
        this.scanner = new Scanner(System.in);
        this.config = config;
        player = new Player();

        GenerateRandomNumber generator = new GenerateRandomNumber(config.getMin(), config.getMax());
        secreteNumber = generator.getSecrete();
    }

    public void startGame() {
        System.out.println("\uD83C\uDFAEWelcome To number Guess Game.");
        System.out.println("I think of a number between " + config.getMin() + " and " + config.getMax() + ". Make a guess.");
        System.out.println("You have " + config.getMaxAttempts() + " Attempts.");

        while (player.getUserAttempts() < config.getMaxAttempts()) {
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid Input!!");
                scanner.next();
                continue;
            }

            int guess = scanner.nextInt();

            if (guess > secreteNumber) {
                System.out.println("⬆\uFE0F Too High");
            } else if (guess < secreteNumber) {
                System.out.println("⬇\uFE0F Too Low");
            } else {
                System.out.println("Correct you guessed It.");
                return;
            }
            player.incrementUserAttempts();
        }
    }
}
