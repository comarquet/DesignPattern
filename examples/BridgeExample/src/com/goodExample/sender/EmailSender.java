package com.goodExample.sender;

public class EmailSender extends AbstractMessageSender {
    @Override
    public void sendMessage(String title, String body, int importance) {
        System.out.println("Email : " + title + "\n" + body + "\nImportance : " + importance + "\n\n");
    }
}

