package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /**
         * For each call to Server.getNewUserData(), you must parse the obtained data in order
         * to create an instance of AdminUser or CustomerUser. On this instance, you must then call
         * the method .saveToDatabase().
         *
         * Use the Factory Method Pattern in order to do so
         */


        for (int i = 0; i < 5; i++) {
            Map<String, String> data = Server.getNewUserData();

            // TODO
        }


    }
}
