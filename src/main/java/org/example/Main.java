package org.example;

import org.example.factory.ArticleFactory;
import org.example.factory.PublicationFactory;
import org.example.observer.ObserverOfPublication;
import org.example.publication.Publication;
import org.example.publication.PublicationStatus;
import org.example.user.Author;

public class Main {
    public static void main(String[] args) {
        PublicationFactory articleFactory = new ArticleFactory();
        Publication article = articleFactory.createPublication();

        ObserverOfPublication observerOfPublication = new ObserverOfPublication();
        Author author = new Author("Ricardo");
        observerOfPublication.subscribe(author);
        observerOfPublication.updatePublication(article, PublicationStatus.HIDDEN);
        observerOfPublication.unsubscribe(author);
        observerOfPublication.updatePublication(article, PublicationStatus.DELETED);
    }
}