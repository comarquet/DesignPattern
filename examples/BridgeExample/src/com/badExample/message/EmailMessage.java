package com.badExample.message;

public class EmailMessage extends Message{
    public EmailMessage(String title, String body, int importance) {
        super(title, body, importance);
    }

    @Override
    public void send() {
        System.out.println("Email : " + this.title + "\n" + this.body + "\nImportance : " + this.importance + "\n\n");
    }
}
