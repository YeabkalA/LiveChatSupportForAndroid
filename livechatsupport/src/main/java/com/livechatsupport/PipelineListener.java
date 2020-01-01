package com.livechatsupport;

public interface PipelineListener {
    void onMessageReceived(ChatMessage message);
    void onMessageSent(ChatMessage message);
}
