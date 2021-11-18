package com.company;

public class Main
{
    public static void main(String[] args)
    {
        // Setup Chain of Responsibility
        AbstractRequestHandler h1 = new NegativeQuantityProductRequestHandler();
        AbstractRequestHandler h2 = new CheckInStoreProductRequestHandler();
        AbstractRequestHandler h3 = new LoggingProductRequestHandler();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        // Send requests to the chain
        h1.handleRequest(new ProductRequest( "FORK", -1));
        h1.handleRequest(new ProductRequest( "PLATE", 2));
        h1.handleRequest(new ProductRequest( "KNIFE", 2));
    }
}
