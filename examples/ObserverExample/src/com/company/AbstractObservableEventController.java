package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class AbstractObservableEventController {

    protected List<AbstractEventObserver> observers;

    public AbstractObservableEventController() {
        this.observers = new ArrayList<>();
    }

    public void attach(AbstractEventObserver observer) {
        this.observers.add(observer);
    }

    public void detach(AbstractEventObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String message) {
        ListIterator<AbstractEventObserver> it = this.observers.listIterator();
        while(it.hasNext()) {
            it.next().update(message);
        }
    }
}
