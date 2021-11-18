package com.company;

public class RequestHandler {
    private LoggedUserRegister loggedUsers;

    public RequestHandler() {
        loggedUsers = new LoggedUserRegister();
    }

    public void handle(Request request) {
        String userName = request.getUserName();
        if (loggedUsers.isUserLogged(userName)) {
            System.out.println("OK " + userName + ", here's your data");
        } else {
            System.out.println("ERROR : your are not logged, thus not authorized to access this data");
        }
    }
}
