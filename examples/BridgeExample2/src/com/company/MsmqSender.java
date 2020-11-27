package com.company;

public class MsmqSender extends AbstractMessageSender {
    @Override
    public void SendMessage(String title, String body, int importance) {
        System.out.println("MSMQ : " + title + "\n" + body + "\nImportance : " + importance + "\n\n");
    }
}
