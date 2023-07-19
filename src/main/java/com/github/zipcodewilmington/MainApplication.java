package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;

public class MainApplication {
    public static void main(String[] args) {
        Casino casino = new Casino();
        casino.run();
    }
}
