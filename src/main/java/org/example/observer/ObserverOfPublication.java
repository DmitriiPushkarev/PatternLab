package org.example.observer;

import org.example.publication.Publication;
import org.example.publication.PublicationStatus;
import org.example.user.Author;

import java.util.ArrayList;
import java.util.List;

public class ObserverOfPublication implements Observer{
    private List<Author> authors;

    public ObserverOfPublication() {
        this.authors = new ArrayList<>();
    }

    @Override
    public void updatePublication(Publication publication, PublicationStatus publicationStatus) {
        publication.setStatus(publicationStatus);
        notify(publicationStatus);
    }

    @Override
    public void subscribe(Author author){
        authors.add(author);
    }

    @Override
    public void unsubscribe(Author author){
        authors.remove(author);
    }

    @Override
    public void notify(PublicationStatus publicationStatus){
        for(Author author: authors){
            author.update(publicationStatus);
        }
    }
}
