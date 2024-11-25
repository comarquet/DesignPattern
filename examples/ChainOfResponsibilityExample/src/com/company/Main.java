package com.company;

import com.company.handlers.AbstractRequestHandler;
import com.company.handlers.CheckInStoreProductRequestHandler;
import com.company.handlers.LoggingProductRequestHandler;
import com.company.handlers.NegativeQuantityProductRequestHandler;
import com.company.model.ProductRequest;

public class Main
{
    public static void main(String[] args)
    {
        // Setup Chain of Responsibility
        AbstractRequestHandler hNegativeRequest = new NegativeQuantityProductRequestHandler();
        AbstractRequestHandler hInStore = new CheckInStoreProductRequestHandler();
        AbstractRequestHandler hLogger = new LoggingProductRequestHandler();

        hLogger.setSuccessor(hNegativeRequest);
        hNegativeRequest.setSuccessor(hInStore);


        // Send requests to the chain
        hLogger.handleRequest(new ProductRequest( "FORK", -1));
        hLogger.handleRequest(new ProductRequest( "PLATE", 2));
        hLogger.handleRequest(new ProductRequest( "KNIFE", 2));
    }
}
