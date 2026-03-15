package models;

public class Visitor {

    private String name;
    private String purpose;
    private String timestamp;

    public Visitor(String name, String purpose, String timestamp) {
        this.name = name;
        this.purpose = purpose;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Visitor: " + name +
               " | Purpose: " + purpose +
               " | Time: " + timestamp;
    }
}