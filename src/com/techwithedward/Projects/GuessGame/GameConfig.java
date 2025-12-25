package com.techwithedward.Projects.GuessGame;

public class GameConfig {
    private final int min;
    private final int max;
    private final int maxAttempts;

    public GameConfig(int min, int max, int maxAttempts) {
        this.min = min;
        this.max = max;
        this.maxAttempts = maxAttempts;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }
}
