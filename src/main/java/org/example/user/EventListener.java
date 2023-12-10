package org.example.user;

import org.example.publication.PublicationStatus;

public interface EventListener {
    void update(PublicationStatus publicationStatus);
}
