package com.company;

public class Main {

    public static void main(String[] args) {
        MessageSenderBase email = new EmailSender();
        MessageSenderBase queue = new MsmqSender();
        MessageSenderBase web = new WebServiceSender();

        Message message = new Message(email, "Error", "an error occured", 1);
        message.send();


        message.setMessageSender(queue);
        message.send();

        message.setMessageSender(web);
        message.send();

        UserEditedMessage userEdited = new UserEditedMessage(
                "Error",
                "An error occured",
                1,
                "Crashed whenn I clicked submit"
        );

        userEdited.setMessageSender(email);
        userEdited.send();
    }
}

