package com.company.bad;


import com.company.bad.utils.UserOptionsPrompt;

public class Main {

    public static void main(String[] args) {
        ProductController eventController = new ProductController();

        UserOptionsPrompt userOptions = new UserOptionsPrompt();
        userOptions.promptUser();


        eventController.placeProductOrder(5, "fork");
        eventController.placeProductOrder(1, "plate");
        eventController.placeProductOrder(50, "glass");
        eventController.placeProductOrder(-6, "spoon");
    }
}


