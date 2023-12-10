package org.example.publication;

public interface Publication {

    public void setStatus(PublicationStatus publicationStatus);
    public void createPublication();

    public void sendPublication();

    public void hidePublication();

    public void deletePublication();
}
