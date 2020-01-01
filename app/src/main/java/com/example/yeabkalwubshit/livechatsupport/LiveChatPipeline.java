package com.example.yeabkalwubshit.livechatsupport;

import java.util.Date;

/**
 * LiveChatPipeline
 *
 *
 */
public class LiveChatPipeline implements Pipeline {
    private static final String MODE_USER = "MODE_USER2020";
    private static final String MODE_ADMIN = "MODE_ADMIN2020";

    private String id;

    private final String mode;
    private final ChatListener listener;

    private LiveChatPipeline(String mode, ChatListener listener) {
        this.mode = mode;
        this.listener = listener;
    }

    public static LiveChatPipeline createPipeline(String mode, ChatListener listener) {
        return new LiveChatPipeline(mode, listener);
    }

    private void initializeDatabaseEntry() throws Exception {
        if(mode.equals(MODE_ADMIN)) {
            throw new Exception("Admin cannot initialize a database entry.");
        }
        final String timeStamp = new Date().toString();
        id = getRandomId();
        initializeDatabaseEntry(timeStamp, id);
    }

    private String getValidId() {
        String randomId = getRandomId();

        while (isIdUsed(randomId)) {
            randomId = getRandomId();
        }

        return randomId;
    }

    private void readUsedIds() {

    }

    private boolean isIdUsed(String id) {
        return false;
    }

    private String getRandomId() {
        return "";
    }

    private void initializeDatabaseEntry(String timeStamp, String pipeLineId) {

    }

    /**
     * Pushes a message to the LiveChat.
     * @param message the message to be sent.
     */
    @Override
    public void pushMessage(ChatMessage message) {
       if (mode.equals(MODE_ADMIN)) {
           sendMessageAsAdmin(message);
       } else {
           sendMessageAsUser(message);
       }
    }

    private void sendMessageAsAdmin(ChatMessage message) {
        listener.onMessageSent(message);
    }

    private void sendMessageAsUser(ChatMessage message) {
        listener.onMessageSent(message);
    }


}
