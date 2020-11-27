package com.company;

public class EventController extends AbstractObservableEventController {
    private String lastMessage;

    public String getLastMessage() {
        return lastMessage;
    }

    public void sendEvent(String message) {
        lastMessage = message;
        /* Perform business logic with message */

        this.notifyObservers();
    }
}
