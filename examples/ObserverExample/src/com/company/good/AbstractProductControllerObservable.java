package com.company.good;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProductControllerObservable {

    protected List<ProductObserverInterface> observers;

    public AbstractProductControllerObservable() {
        this.observers = new ArrayList<>();
    }

    public void attach(ProductObserverInterface observer) {
        this.observers.add(observer);
    }

    public void detach(ProductObserverInterface observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(ProductOrder newOrder, List<ProductOrder> currentProductOderList) {
        for (ProductObserverInterface observer : this.observers) {
            observer.update(newOrder, currentProductOderList);
        }
    }
}
