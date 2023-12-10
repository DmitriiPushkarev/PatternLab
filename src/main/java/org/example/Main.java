package org.example;

import org.example.factory.ArticleFactory;
import org.example.factory.PublicationFactory;
import org.example.observer.EventManager;
import org.example.publication.Publication;
import org.example.publication.PublicationStatus;
import org.example.user.Author;

public class Main {
    public static void main(String[] args) {
        PublicationFactory articleFactory = new ArticleFactory();
        Publication article = articleFactory.createPublication();

        EventManager eventManager = new EventManager();
        Author author = new Author("Ricardo");
        eventManager.subscribe(author);
        eventManager.updatePublication(article, PublicationStatus.HIDDEN);
        eventManager.unsubscribe(author);
        eventManager.updatePublication(article, PublicationStatus.DELETED);
    }
}