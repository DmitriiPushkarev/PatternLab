package org.example.observer;

import org.example.publication.Publication;
import org.example.publication.PublicationStatus;
import org.example.user.Author;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Author> authors;

    public EventManager() {
        this.authors = new ArrayList<>();
    }

    public void updatePublication(Publication publication, PublicationStatus publicationStatus) {
        publication.setStatus(publicationStatus);
        notify(publicationStatus);
    }

    public void subscribe(Author author){
        authors.add(author);
    }

    public void unsubscribe(Author author){
        authors.remove(author);
    }

    public void notify(PublicationStatus publicationStatus){
        for(Author author: authors){
            author.update(publicationStatus);
        }
    }
}
