package com.goodExample;

import com.goodExample.message.Message;
import com.goodExample.message.UserEditedMessage;
import com.goodExample.sender.AbstractMessageSender;
import com.goodExample.sender.EmailSender;
import com.goodExample.sender.MsmqSender;
import com.goodExample.sender.WebServiceSender;

public class Main {

    public static void main(String[] args) {
        AbstractMessageSender email = new EmailSender();
        AbstractMessageSender queue = new MsmqSender();
        AbstractMessageSender web = new WebServiceSender();

        Message message = new Message(email, "Trafic report", "There were 487 requests last hour", 1);
        message.send();


        message.setMessageSender(queue);
        message.send();

        message.setMessageSender(web);
        message.send();

        UserEditedMessage userEdited = new UserEditedMessage(
                "Trafic report",
                "There were 487 requests last hour",
                1,
                "This is the report to be archived for the main server"
        );

        userEdited.setMessageSender(email);
        userEdited.send();
    }
}

