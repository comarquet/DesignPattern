package com.company;

public class Main {

    public static void main(String[] args) {
        ObservableEventController eventController = new ObservableEventController();

        AbstractEventObserver emailer = new ObserverEmailer();
        //eventController.attach(emailer);

        AbstractEventObserver logger = new ObserverLogger();
        //eventController.attach(logger);



        eventController.sendEvent("Customer #123 ordered product #455");
    }
}


