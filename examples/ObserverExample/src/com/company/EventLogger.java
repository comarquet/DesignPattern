package com.company;

public class EventLogger extends EventObserver {
    @Override
    public void update(String message) {
        System.out.println("Logging: " + message);
    }
}
