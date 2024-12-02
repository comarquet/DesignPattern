package com.company.util;

import java.util.List;
import com.company.ChatMessage;

public class ChatMarkdowRenderer {

    public String render(List<ChatMessage> chatContent) {
        String res = "";
        for (ChatMessage message : chatContent) {
            res += String.format("**%s**: %s\n", message.getAuthor(), message.getContent());
        }
        return res;
    }


}
