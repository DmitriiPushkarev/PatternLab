package org.example.factory;

import org.example.publication.Comment;
import org.example.publication.Publication;
import org.example.publication.PublicationStatus;

public class CommentFactory implements PublicationFactory{
    @Override
    public Publication createPublication() {
        return new Comment(PublicationStatus.CREATED);
    }
}
