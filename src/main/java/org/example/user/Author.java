package org.example.user;

import org.example.publication.PublicationStatus;

public class Author implements EventListener{
    public String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public void update(PublicationStatus publicationStatus){
        System.out.println("Обновление статуса публикации: " + publicationStatus);
    }
}
