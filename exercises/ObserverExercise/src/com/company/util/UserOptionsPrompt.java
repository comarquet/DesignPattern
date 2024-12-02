package com.company.util;

import java.util.Scanner;

public class UserOptionsPrompt {
    // Enum for format options
    public enum ChatDisplayFormat {
        MARKDOWN, HTML
    }

    private ChatDisplayFormat preferredFormat;
    private boolean chatSizeWarningActivated;

    public void prompt() {
        Scanner scanner = new Scanner(System.in);

        // Prompt for preferred format
        while (true) {
            System.out.println("Would you like to display the chat in markdown or html format?");
            System.out.println("Enter \"markdown\" or \"html\":");
            String formatInput = scanner.nextLine().trim().toLowerCase();

            if (formatInput.equals("markdown")) {
                preferredFormat = ChatDisplayFormat.MARKDOWN;
                break;
            } else if (formatInput.equals("html")) {
                preferredFormat = ChatDisplayFormat.HTML;
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        // Prompt for chat size warning preference
        while (true) {
            System.out.println("Do you want to display chat remaining size warning?");
            System.out.println("Enter \"y\" or \"n\":");
            String warningInput = scanner.nextLine().trim().toLowerCase();

            if (warningInput.equals("y")) {
                chatSizeWarningActivated = true;
                break;
            } else if (warningInput.equals("n")) {
                chatSizeWarningActivated = false;
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    // Getter for preferred format
    public ChatDisplayFormat getPreferredFormat() {
        return preferredFormat;
    }

    // Getter for chat size warning activation
    public boolean isChatSizeWarningActivated() {
        return chatSizeWarningActivated;
    }

}
