package org.example;

public class Game {
    public static void main(String[] args) {
        GameConfig config1 = new GameConfig();
        ExtendedGameConfig config2 = new ExtendedGameConfig();

        System.out.println(config1.getGAME_NAME());
        System.out.println(config1.validateConfig());

    }
}
