package com.company;

import java.util.ArrayList;

public abstract class AbstractObservableEventController {
    private ArrayList<EventObserver> observers = new ArrayList();

    public void attach(EventObserver observer) {
        this.observers.add(observer);
    }

    public void detach(EventObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (EventObserver observer : observers) {
            observer.update(this);
        }
    }
}
