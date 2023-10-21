package com.badExample.message;

public class MsmqMessage extends Message {

    public MsmqMessage(String title, String body, int importance) {
        super(title, body, importance);
    }

    @Override
    public void send() {
        System.out.println("MSMQ : " + this.title + "\n" + this.body + "\nImportance : " + this.importance + "\n\n");
    }
}
