package com.livechatsupport;

/**
 * Interface for a LiveChat Pipeline.
 */
public interface Pipeline {
    /** Mode used by end users. */
    String MODE_USER = "MODE_USER2020";
    /** Mode used by admin. */
    String MODE_ADMIN = "MODE_ADMIN2020";

    /**
     * Sends a message to the pipeline.
     * @param message the message to be pushed to pipeline.
     */
    void pushMessage(ChatMessage message);
}
