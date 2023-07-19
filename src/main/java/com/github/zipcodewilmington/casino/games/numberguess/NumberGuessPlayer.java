package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer implements PlayerInterface {
    private CasinoAccount account;

    public NumberGuessPlayer(CasinoAccount account) {
        this.account = account;
    }

    @Override
    public CasinoAccount getCasinoAccount() {
        return account;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}