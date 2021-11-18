package com.company;

public class Server {
    LoggedUserRegister loggedUsers;

    public Server() {
        loggedUsers = new LoggedUserRegister();
    }

    public void connect() {
        /** Add default users Alice and Bob */
        loggedUsers.logUser("Alice");
        loggedUsers.logUser("Bob");
    }

    public Request getIncomingRequest() {
        return new Request("Please get my account data", "Bob");
    }
}
