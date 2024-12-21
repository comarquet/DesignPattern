package com.company;

public class WebServer {
    private RequestHandler firstHandler;
    
    public WebServer(RequestHandler firstHandler) {
        this.firstHandler = firstHandler;
    }
    
    public void getRequest(WebRequest request) {
        firstHandler.handleRequest(request);
    }
    
}
