package com.techwithedward.Projects.GuessGame;

import java.util.Scanner;

public class Main {
    static void main() {
        GameConfig config = new GameConfig(0, 100, 7);
        NumberGuessGame game = new NumberGuessGame(config);
        game.startGame();
    }
}
