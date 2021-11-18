package com.solution;

import java.util.ArrayList;
import java.util.List;

public class LoggedUserRegister {
    private List<String> listOfLoggedUsers;
    private static LoggedUserRegister instance;

    private LoggedUserRegister() {
        listOfLoggedUsers = new ArrayList<>();
    }

    public void logUser(String name) {
        this.listOfLoggedUsers.add(name);
    }

    public void unlogUser(String name) {
        this.listOfLoggedUsers.remove(name);
    }

    public boolean isUserLogged(String name) {
        return this.listOfLoggedUsers.contains(name);
    }

    public static LoggedUserRegister getInstance() {
        if (instance == null) {
            instance = new LoggedUserRegister();
        }
        return instance;
    }
}