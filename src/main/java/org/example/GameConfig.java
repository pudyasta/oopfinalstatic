package org.example;

public final class GameConfig {
    private final int MAX_PLAYER = 10;
    private final int DEFAULT_LEVEL =20;
    private final String GAME_NAME = "Lost in Tokyo";

    public final String validateConfig(){
        if (MAX_PLAYER < 11 && DEFAULT_LEVEL < 21 && GAME_NAME.equals("Lost in Tokyo")){
            return "Valid";
        }else{
            return "Not Valid";
        }
    }
    public int getMAX_PLAYER() {
        return MAX_PLAYER;
    }

    public int getDEFAULT_LEVEL() {
        return DEFAULT_LEVEL;
    }

    public String getGAME_NAME() {
        return GAME_NAME;
    }

}
