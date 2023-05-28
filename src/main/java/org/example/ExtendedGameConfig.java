package org.example;

public class ExtendedGameConfig extends GameConfig {
    private boolean ENABLE_DEBUG_MODE;

    public boolean isENABLE_DEBUG_MODE() {
        return ENABLE_DEBUG_MODE;
    }

    public void setENABLE_DEBUG_MODE(boolean ENABLE_DEBUG_MODE) {
        this.ENABLE_DEBUG_MODE = ENABLE_DEBUG_MODE;
    }
}
