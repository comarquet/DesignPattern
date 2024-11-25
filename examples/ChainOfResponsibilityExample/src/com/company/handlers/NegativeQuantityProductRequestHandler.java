package com.company.handlers;

import com.company.model.ProductRequest;

public class NegativeQuantityProductRequestHandler extends AbstractRequestHandler {
    /* This handler checks if the quantity of a product request is negative */

    public void handleRequest(ProductRequest request) {
        if (request.getQuantity() < 0) {
            //if request is eligible handle it
            System.out.println("A product request with a negative quantity was made, we stop the request handling and we send a report");
        } else {
            super.handleRequest(request);
        }
    }
}
