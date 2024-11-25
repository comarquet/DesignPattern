package com.company.handlers;

import com.company.model.ProductRequest;

public abstract class AbstractRequestHandler {
    protected AbstractRequestHandler successor;

    public AbstractRequestHandler setSuccessor(AbstractRequestHandler successor) {
        this.successor = successor;
        return this.successor;
    }

    public void handleRequest(ProductRequest request)  {
        if (this.successor != null) {
            this.successor.handleRequest(request);
        }
    }

}
