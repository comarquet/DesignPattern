package com.company;

public class EventEmailer extends EventObserver {
    @Override
    public void update(String message) {
        System.out.println("Emailing: " + message);
    }
}
