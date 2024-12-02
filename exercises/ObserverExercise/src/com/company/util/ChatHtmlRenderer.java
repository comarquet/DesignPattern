package com.company.util;

import com.company.ChatMessage;

import java.util.List;

public class ChatHtmlRenderer {

    public String render(List<ChatMessage> chatContent) {
        String res = "";
        for (ChatMessage message : chatContent) {
            res += String.format("<p><strong>%s</strong>: %s</p>\n", message.getAuthor(), message.getContent());
        }
        return res;
    }

    
}
