package services;

import java.util.HashMap;
import java.util.List;

import models.User;
import datastructures.ZoneArray;
import utils.FileHandler;

public class AuthenticationService {

    private HashMap<String, User> cardMap;
    private ZoneArray zoneArray;

    public AuthenticationService(ZoneArray zoneArray) {
        this.zoneArray = zoneArray;
        cardMap = new HashMap<>();
        loadUsersFromCSV();
    }

    private void loadUsersFromCSV() {

        FileHandler fileHandler = new FileHandler();
        List<String> lines = fileHandler.readFile("users.csv");

        // Skip header
        for (int i = 1; i < lines.size(); i++) {

            String[] parts = lines.get(i).split(",");

            if (parts.length == 4) {

                String userId = parts[0].trim();
                String name = parts[1].trim();
                String cardId = parts[2].trim();
                String zoneId = parts[3].trim();

                User user = new User(userId, name, cardId, zoneId);

                cardMap.put(cardId, user);
            }
        }
    }

    public boolean verifyCard(String cardId, String zoneId) {

        if (!cardMap.containsKey(cardId)) {
            return false;
        }

        User user = cardMap.get(cardId);

        return user.getAssignedZone().equalsIgnoreCase(zoneId)
                && zoneArray.zoneExists(zoneId);
    }

    public User getUserByCard(String cardId) {
        return cardMap.get(cardId);
    }
}