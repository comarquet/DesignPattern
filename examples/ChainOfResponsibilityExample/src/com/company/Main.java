package com.company;

public class Main
{
    public static void main(String[] args)
    {
        // Setup Chain of Responsibility
        RequestHandler h1 = new ConcreteHandlerOne();
        RequestHandler h2 = new ConcreteHandlerTwo();
        RequestHandler h3 = new ConcreteHandlerThree();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        // Send requests to the chain
        h1.handleRequest(new Request("Negative Value ", -1));
        h1.handleRequest(new Request("Negative Value ",  0));
        h1.handleRequest(new Request("Negative Value ",  1));
        h1.handleRequest(new Request("Negative Value ",  2));
        h1.handleRequest(new Request("Negative Value ", -5));
    }
}
