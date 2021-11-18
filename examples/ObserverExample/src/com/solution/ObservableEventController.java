package com.solution;

import com.company.AbstractObservableEventController;

import java.util.ArrayList;
import java.util.List;

public class ObservableEventController extends AbstractObservableEventController {
    private List<String> allMessages = new ArrayList<String>();

    public void sendEvent(String message) {
        /* Perform business logic with message */
        System.out.println("Event Controller is registering message (" + message + ") in its database\n\n");
        this.allMessages.add(message);

        /* Notify observers */
        this.notifyObservers(message);
    }
}
