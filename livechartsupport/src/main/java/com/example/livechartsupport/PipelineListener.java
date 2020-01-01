package com.example.livechartsupport;

public interface PipelineListener {
    void onMessageReceived(ChatMessage message);
    void onMessageSent(ChatMessage message);
}
