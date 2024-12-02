package com.company.good;


import com.company.good.utils.UserOptionsPrompt;

public class Main {

    public static void main(String[] args) {
        ObservableProductController eventController = new ObservableProductController();

        UserOptionsPrompt userOptions = new UserOptionsPrompt();
        userOptions.promptUser();

        if (userOptions.isEmailerSelected()) {
            ProductObserverInterface emailer = new EmailerProductObserver();
            eventController.attach(emailer);
        }

        if (userOptions.isLoggerSelected()) {
            ProductObserverInterface logger = new LoggerProductObserver();
            eventController.attach(logger);
        }



        eventController.placeProductOrder(5, "fork");
        eventController.placeProductOrder(1, "plate");
        eventController.placeProductOrder(50, "glass");
        eventController.placeProductOrder(-6, "spoon");
    }
}


