package com.github.zipcodewilmington.casino;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractGame<
        SomePlayerInterface extends PlayerInterface>
        implements GameInterface<SomePlayerInterface> {
    private List<SomePlayerInterface> players; // field values

    public AbstractGame(List<SomePlayerInterface> players) { // actual construction values which are a 1-1 match with field-values
        this.players = players;
    }

    public AbstractGame() { // default values
        this(new ArrayList<>());
    }

    @Override
    public List<SomePlayerInterface> getPlayers() {
        return players;
    }
}
