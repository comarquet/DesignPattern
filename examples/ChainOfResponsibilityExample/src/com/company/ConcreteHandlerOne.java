package com.company;

public class ConcreteHandlerOne extends AbstractRequestHandler {

    public void handleRequest(Request request) {
        if (request.getValue() < 0) {
            //if request is eligible handle it
            System.out.println("Negative values are handled by ConcreteHandlerOne:");
            System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getValue());
        } else {
            this.successorHandleRequest(request);
        }
    }
}
