package com.techwithedward.Projects.GuessGame;

public class Player {
    private int userAttempts = 0;

    public void incrementUserAttempts() {
        userAttempts++;
    }

    public int getUserAttempts() {
        return userAttempts;
    }
}
