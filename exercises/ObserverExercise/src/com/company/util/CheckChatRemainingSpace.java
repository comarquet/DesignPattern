package com.company.util;

import com.company.ChatController;

public class CheckChatRemainingSpace {
    public String getRemainingSpaceMessage(ChatController chatController) {
        return String.format("The chat has size for %s messages left", chatController.CHAT_MAX_SIZE - chatController.getChatContent().size());
    }
}
