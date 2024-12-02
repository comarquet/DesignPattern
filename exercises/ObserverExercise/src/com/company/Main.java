package com.company;

import com.company.util.UserOptionsPrompt;

public class Main {

    public static void main(String[] args) {
        UserOptionsPrompt userOptions = new UserOptionsPrompt();
        userOptions.prompt();

        ChatController chatController = new ChatController();
        chatController.start();


    }
}
