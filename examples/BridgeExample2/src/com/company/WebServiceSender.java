package com.company;

public class WebServiceSender extends AbstractMessageSender {
    @Override
    public void SendMessage(String title, String body, int importance) {
        System.out.println("WebService : " + title + "\n" + body + "\nImportance : " + importance + "\n\n");
    }
}
