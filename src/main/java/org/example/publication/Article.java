package org.example.publication;

public class Article implements Publication {

    public PublicationStatus publicationStatus;

    public Article(PublicationStatus publicationStatus) {
        this.publicationStatus = publicationStatus;
    }

    @Override
    public void setStatus(PublicationStatus publicationStatus) {
        this.publicationStatus = publicationStatus;
    }

    @Override
    public void createPublication() {
        this.publicationStatus = PublicationStatus.CREATED;
        System.out.println("Article was created!");
    }

    @Override
    public void sendPublication() {
        this.publicationStatus = PublicationStatus.SENT;
        System.out.println("Article was sent!");
    }

    @Override
    public void hidePublication() {
        this.publicationStatus = PublicationStatus.HIDDEN;
        System.out.println("Article was hidden!");
    }

    @Override
    public void deletePublication() {
        this.publicationStatus = PublicationStatus.DELETED;
        System.out.println("Article was deleted!");
    }
}
