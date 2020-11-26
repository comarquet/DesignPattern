package com.company;

public class UserEditedMessage extends Message {
    private String userComments;

    public UserEditedMessage(MessageSenderBase messageSender, String title, String body, int importance, String userComments) {
        super(messageSender, title, body, importance);
        this.userComments = userComments;
    }

    public UserEditedMessage(String title, String body, int importance, String userComments) {
        super(title, body, importance);
        this.userComments = userComments;
    }

    @Override
    public void send() {
        String fullBody = this.body + "\nCOMMENTS\n==========\n" + this.userComments;
        this.messageSender.SendMessage(this.title, fullBody, this.importance);
    }
}
