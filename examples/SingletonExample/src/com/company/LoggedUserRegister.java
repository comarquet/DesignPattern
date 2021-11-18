package com.company;

import java.util.ArrayList;
import java.util.List;

public class LoggedUserRegister {
    private List<String> listOfLoggedUsers;

    public LoggedUserRegister() {
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
}
