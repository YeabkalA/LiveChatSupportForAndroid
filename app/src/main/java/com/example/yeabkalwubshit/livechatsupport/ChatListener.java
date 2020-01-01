package com.example.yeabkalwubshit.livechatsupport;


public interface ChatListener {
    void onMessageReceived(ChatMessage message);
    void onMessageSent(ChatMessage message);

}
