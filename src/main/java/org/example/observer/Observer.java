package org.example.observer;

import org.example.publication.Publication;
import org.example.publication.PublicationStatus;
import org.example.user.Author;

public interface Observer {
    public void updatePublication(Publication publication, PublicationStatus publicationStatus);

    public void subscribe(Author author);

    public void unsubscribe(Author author);

    public void notify(PublicationStatus publicationStatus);
}
