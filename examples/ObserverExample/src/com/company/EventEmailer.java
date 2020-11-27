package com.company;

public class EventEmailer extends EventObserver {
    @Override
    public void update(EventController eventController) {
        System.out.println("Emailing: " + eventController.getLastMessage());
    }
}