package com.company;

public class Main {

    public static void main(String[] args) {
        EventController eventController = new EventController();

        EventObserver emailer = new EventEmailer();
        eventController.attach(emailer);

        EventObserver logger = new EventLogger();
        eventController.attach(logger);



        eventController.sendEvent("Message with two observers.");
    }
}


