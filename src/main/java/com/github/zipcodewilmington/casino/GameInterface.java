package com.github.zipcodewilmington.casino;

import java.util.List;

/**
 * Created by leon on 7/21/2020.
 */
public interface GameInterface<SomePlayerInterface extends PlayerInterface> extends Runnable {

    List<SomePlayerInterface> getPlayers();


    default void add(SomePlayerInterface player) {
        getPlayers().add(player);
    }


    default void remove(SomePlayerInterface player) {
        getPlayers().remove(player);
    }


    default void run() {
        for (SomePlayerInterface player : getPlayers()) {
            player.play();
        }
    }
}
