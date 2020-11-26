package com.company;

public class ConcreteHandlerTwo extends RequestHandler {
    public void handleRequest(Request request) {
        if (request.getValue() > 0) {           //if request is eligible handle it
            System.out.println("Positive values are handled by ConcreteHandlerTwo:");
            System.out.println("\tConcreteHandlerTwo.HandleRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            this.successor.handleRequest(request);
        }
    }
}
