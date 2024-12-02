package com.company;

import com.company.util.ChatMarkdowRenderer;
import com.company.util.CheckChatRemainingSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ChatController {
    protected List<ChatMessage> chatContent = new ArrayList<>();
    public final int CHAT_MAX_SIZE = 20;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        ChatMarkdowRenderer testMarkdownRenderer = new ChatMarkdowRenderer();
        CheckChatRemainingSpace testCheckChatRemainingSpace = new CheckChatRemainingSpace();

        while(chatContent.size() < CHAT_MAX_SIZE) {
            System.out.print("Enter message : ");
            String userInput = scanner.nextLine();
            ChatMessage newMessage =  new ChatMessage(userInput);
            this.chatContent.add(newMessage);
            System.out.println(testMarkdownRenderer.render(this.chatContent));
            System.out.println(testCheckChatRemainingSpace.getRemainingSpaceMessage(this));

        }
    }

    public List<ChatMessage> getChatContent() {
        return chatContent;
    }
}
