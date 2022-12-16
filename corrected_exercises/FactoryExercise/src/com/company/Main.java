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

        UserFactory userFactory = new UserFactory();


        for (int i = 0; i < 5; i++) {
            Map<String, String> data = Server.getNewUserData();

            /* Parsing data */
            AbstractUser user = userFactory.createUser(data);
            user.saveToDatabase();
        }


    }
}
