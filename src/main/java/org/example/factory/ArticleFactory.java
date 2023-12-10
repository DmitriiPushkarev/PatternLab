package org.example.factory;

import org.example.publication.Article;
import org.example.publication.Publication;
import org.example.publication.PublicationStatus;

public class ArticleFactory implements PublicationFactory{
    @Override
    public Publication createPublication() {
        return new Article(PublicationStatus.CREATED);
    }
}
