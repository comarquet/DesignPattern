package com.company;

public class ConcreteHandlerThree extends RequestHandler {
    public void handleRequest(Request request) {
        if (request.getValue() >= 0) {           //if request is eligible handle it
            System.out.println("Zero values are handled by ConcreteHandlerThree:");
            System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            this.successor.handleRequest(request);
        }
    }
}
