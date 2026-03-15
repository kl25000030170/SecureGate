package utils;

public class InputValidator {

    public static boolean isValidCardId(String cardId) {
        return cardId != null && cardId.startsWith("CARD");
    }

    public static boolean isValidZone(String zoneId) {
        return zoneId != null && zoneId.startsWith("Z");
    }
}