package com.company;

public class ConcreteHandlerThree extends AbstractRequestHandler {
    public void handleRequest(Request request) {
        if (request.getValue() == 0) {           //if request is eligible handle it
            System.out.println("Zero values are handled by ConcreteHandlerThree:");
            System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getValue());
        } else {
            this.successorHandleRequest(request);
        }
    }
}
