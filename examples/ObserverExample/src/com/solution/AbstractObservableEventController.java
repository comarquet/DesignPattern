package com.solution;

import com.company.AbstractEventObserver;

import java.util.ArrayList;

public abstract class AbstractObservableEventController {
    private ArrayList<AbstractEventObserver> observers = new ArrayList();

    public void attach(AbstractEventObserver observer) {
        this.observers.add(observer);
    }

    public void detach(AbstractEventObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (AbstractEventObserver observer : observers) {
            observer.update(message);
        }
    }
}