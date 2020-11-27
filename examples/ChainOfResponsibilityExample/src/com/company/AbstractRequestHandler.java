package com.company;

public abstract class AbstractRequestHandler {
    protected AbstractRequestHandler successor;

    public void setSuccessor(AbstractRequestHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

    protected void successorHandleRequest(Request request) {
        if (this.successor != null) {
            this.successor.handleRequest(request);
        }
    }
}
