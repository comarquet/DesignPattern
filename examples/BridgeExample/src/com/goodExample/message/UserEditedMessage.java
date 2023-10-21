package com.goodExample.message;

import com.goodExample.sender.AbstractMessageSender;

public class UserEditedMessage extends Message {
    private String userComments;

    public UserEditedMessage(AbstractMessageSender messageSender, String title, String body, int importance, String userComments) {
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
        this.messageSender.sendMessage(this.title, fullBody, this.importance);
    }
}
