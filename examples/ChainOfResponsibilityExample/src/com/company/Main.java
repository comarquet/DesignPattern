package com.company;

public class Main
{
    public static void main(String[] args)
    {
        // Setup Chain of Responsibility
        AbstractRequestHandler h1 = new ConcreteHandlerOne();
        AbstractRequestHandler h2 = new ConcreteHandlerTwo();
        AbstractRequestHandler h3 = new ConcreteHandlerThree();

        h1.setSuccessor(h2);
        //h2.setSuccessor(h3);

        // Send requests to the chain
        h1.handleRequest(new Request( -1));
        h1.handleRequest(new Request( 0));
        h1.handleRequest(new Request( 1));
        h1.handleRequest(new Request(2));
        h1.handleRequest(new Request( -5));
    }
}
