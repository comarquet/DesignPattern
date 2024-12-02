package com.company.bad.utils;

import java.util.Scanner;

public class UserOptionsPrompt {
    private boolean loggerSelected = false;
    private boolean emailerSelected = false;

    public void promptUser() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("What functionalities do you want to add to the controller?");
            System.out.println("[1] Log product orders");
            System.out.println("[2] Send email confirmation of product orders");
            System.out.println("Type the number of the functionality you want (separated with spaces if you want to select multiple), or nothing if you don't want any of these functionalities:");

            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                loggerSelected = false;
                emailerSelected = false;
                validInput = true;
            } else {
                String[] parts = input.split("\\s+");
                boolean allValid = true;

                for (String part : parts) {
                    if (!part.equals("1") && !part.equals("2")) {
                        allValid = false;
                        break;
                    }
                }

                if (allValid) {
                    loggerSelected = false;
                    emailerSelected = false;

                    for (String part : parts) {
                        if (part.equals("1")) {
                            loggerSelected = true;
                        } else if (part.equals("2")) {
                            emailerSelected = true;
                        }
                    }

                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }

        scanner.close();
    }

    public boolean isLoggerSelected() {
        return loggerSelected;
    }

    public boolean isEmailerSelected() {
        return emailerSelected;
    }
}