package models;

public class User {

    private String userId;
    private String name;
    private String cardId;
    private String assignedZone;

    public User(String userId, String name, String cardId, String assignedZone) {
        this.userId = userId;
        this.name = name;
        this.cardId = cardId;
        this.assignedZone = assignedZone;
    }

    public String getUserId() {
        return userId;
    }

    public String getCardId() {
        return cardId;
    }

    public String getAssignedZone() {
        return assignedZone;
    }

    public String getName() {
        return name;
    }
}