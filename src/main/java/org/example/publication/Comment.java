package org.example.publication;

public class Comment implements Publication{

    public PublicationStatus publicationStatus;

    public Comment(PublicationStatus publicationStatus) {
        this.publicationStatus = publicationStatus;
    }

    @Override
    public void setStatus(PublicationStatus publicationStatus) {
        this.publicationStatus = publicationStatus;
    }

    @Override
    public void createPublication() {
        this.publicationStatus = PublicationStatus.CREATED;
        System.out.println("Comment was created!");
    }

    @Override
    public void sendPublication() {
        this.publicationStatus = PublicationStatus.SENT;
        System.out.println("Comment was sent!");
    }

    @Override
    public void hidePublication() {
        this.publicationStatus = PublicationStatus.HIDDEN;
        System.out.println("Comment was hidden!");
    }

    @Override
    public void deletePublication() {
        this.publicationStatus = PublicationStatus.DELETED;
        System.out.println("Comment was deleted!");
    }
}
