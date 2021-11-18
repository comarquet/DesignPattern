package com.solution;

public abstract class AbstractRequestHandler {
    protected AbstractRequestHandler successor;

    public void setSuccessor(AbstractRequestHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(ProductRequest request);

    protected void successorHandleRequest(ProductRequest request) {
        if (this.successor != null) {
            this.successor.handleRequest(request);
        }
    }
}
