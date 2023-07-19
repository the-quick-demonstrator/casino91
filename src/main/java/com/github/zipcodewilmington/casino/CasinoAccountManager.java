package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */
public class CasinoAccountManager {
    private List<CasinoAccount> accounts;
    private IOConsole console;

    public CasinoAccountManager(List<CasinoAccount> accounts, IOConsole console) {
        this.accounts = accounts;
        this.console = console;
    }

    public CasinoAccountManager() {
        this(new ArrayList<>(), new IOConsole(AnsiColor.PURPLE));
    }

    /**
     * @param accountName     name of account to be returned
     * @param accountPassword password of account to be returned
     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount getAccount(String accountName, String accountPassword) {
        console.println("Attempting to `getAccount(%s, %s)`...", accountName, accountPassword);
        for (CasinoAccount account : accounts) {
            String currentName = account.getName();
            String currentPass = account.getPassword();
            boolean isCorrectName = currentName.equals(accountName);
            boolean isCorrectPass = currentPass.equals(accountPassword);
            boolean isValidLogin = isCorrectName && isCorrectPass;
            if (isValidLogin) {
                console.println("Successfully found account!");
                console.println(account.toString());
                return account;
            }
        }
        console.println("Failed to find account!");
        return null;
    }

    /**
     * logs & creates a new `ArcadeAccount`
     *
     * @param accountName     name of account to be created
     * @param accountPassword password of account to be created
     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount createAccount(String accountName, String accountPassword) {
        console.println("Attempting to `createAccount(%s, %s)`...", accountName, accountPassword);
        CasinoAccount account = new CasinoAccount(accountName, accountPassword);
        console.println("Successfully created account!");
        console.println(account.toString());
        return account;
    }

    /**
     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
     *
     * @param casinoAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
     */
    public void registerAccount(CasinoAccount casinoAccount) {
        console.println("Attempting to `registerAccount(%s)`...", casinoAccount.toString());
        accounts.add(casinoAccount);
        console.println("Successfully registered account!");
    }
}
