package org.example.publication;

public enum PublicationStatus {
    CREATED("Created"),
    SENT("Sent"),
    HIDDEN("Hidden"),
    DELETED("Deleted");

    private String status;

    PublicationStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PublicationStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
