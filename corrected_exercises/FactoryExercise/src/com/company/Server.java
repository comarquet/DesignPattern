package com.company;

import java.sql.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Server {

    private static String[] randomNames = { "Alice", "Bob", "Charlie", "Dave", "Eliott"};
    private static String[] randomEmails = {
            "test1@gmail.com", "contact@emse.fr", "noreply@orange.fr", "test2@dir.com", "info@info.info"
    };


    /**
     * This method returns some user data (which is generated randomly for this example,
     * but it could be data obtained from a user request to the server). This data is
     * put into a HashMap, with the following keys :
     * - "name"
     * - "email"
     * - "adminRights" if the user is an admin
     * - "creditCardInfo" if the user is a customer
     * @return
     */
    public static HashMap<String, String> getNewUserData() {
        /** Generate random user data, for the sake of this example */
        HashMap<String, String> userData = new HashMap<>();
        Random randomGenerator = new Random();
        userData.put("name", randomNames[randomGenerator.nextInt(randomNames.length)]);
        userData.put("email", randomNames[randomGenerator.nextInt(randomNames.length)]);
        if (randomGenerator.nextBoolean()) {
            userData.put("adminRights", "CAN_EDIT;CAN_DELETE");
        } else {
            userData.put("creditCardInfo", "4575-9871-1245-5441");
        }
        return userData;
    }
}
