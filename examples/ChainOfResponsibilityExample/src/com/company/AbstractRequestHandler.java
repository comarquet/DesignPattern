package com.company;

public abstract class AbstractRequestHandler {
    protected AbstractRequestHandler successor;

    public void setSuccessor(AbstractRequestHandler successor) {
        this.successor = successor;
    }

    public void handleRequest(ProductRequest request)  {
        if (this.successor != null) {
            this.successor.handleRequest(request);
        }
    }

}
