package com.solution;

import com.company.AbstractEventObserver;

public class ObserverEmailer implements AbstractEventObserver {
    @Override
    public void update(String message) {
        System.out.println("==== SENDING THE FOLLOWING EMAIL ===");
        System.out.println("Object: " + message);
        System.out.println("=======\n");

    }
}