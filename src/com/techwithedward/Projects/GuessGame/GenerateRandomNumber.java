package com.techwithedward.Projects.GuessGame;

public class GenerateRandomNumber {
    private final int secrete;

    public GenerateRandomNumber(int min, int max) {
        secrete = (int) (Math.random() * (max - min + 1)) + min;
    }

    public int getSecrete() {
        return secrete;
    }
}

