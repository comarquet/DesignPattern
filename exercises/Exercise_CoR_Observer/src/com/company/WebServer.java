package com.company;

import java.util.ArrayList;
import java.util.List;

public class WebServer implements WebRequestObservable {
    private RequestHandler firstHandler;
    private List<WebRequestObserver> observers;
    
    public WebServer(RequestHandler firstHandler) {
        this.firstHandler = firstHandler;
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void attach(WebRequestObserver observer) {
        observers.add(observer);
    }
    
    @Override
    public void detach(WebRequestObserver observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers(WebRequest webRequest) {
        for (WebRequestObserver observer : observers) {
            observer.update(webRequest);
        }
    }
    
    public void getRequest(WebRequest request) {
        notifyObservers(request);
        firstHandler.handleRequest(request);
    }
}
