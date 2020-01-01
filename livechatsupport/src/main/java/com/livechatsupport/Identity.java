package com.livechatsupport;

/**
 * Interface representing the identity of a chatter.
 */
public interface Identity {
    /**
     *
     * @return preferred (display) name of the chatter.
     */
    String preferredName();

    /**
     *
     * @return name of chatter to be used for record purposes (e.g. full name).
     */
    String recordName();

    /**
     * Should be configured to the channel's email address for {@link Pipeline#MODE_ADMIN} mdoe.
     * @return the email address of the chatter.
     */
    String emailAddress();

    /**
     * Returns the mode in which the chatter acts.
     * @return {@link Pipeline#MODE_ADMIN} or {@link Pipeline#MODE_USER}
     */
    String mode();
}
