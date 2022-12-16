package com.company;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();

        /* Connect users Alice and Bob */
        server.connect();

        /** An incoming request */
        Request incomingRequest = server.getIncomingRequest();
        RequestHandler handler = new RequestHandler();
        handler.handle(incomingRequest);
    }
}
