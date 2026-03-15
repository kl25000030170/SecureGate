package datastructures;

import java.util.List;

public class ZoneArray {

    private String[] zones;
    private int size;

    public ZoneArray(int capacity) {
        zones = new String[capacity];
        size = 0;
    }

    public void loadZones(List<String> zoneList) {

        for (String zone : zoneList) {
            if (size < zones.length) {
                zones[size++] = zone.trim();
            }
        }
    }

    public boolean zoneExists(String zoneId) {
        for (int i = 0; i < size; i++) {
            if (zones[i].equalsIgnoreCase(zoneId)) {
                return true;
            }
        }
        return false;
    }

    public void displayZones() {
        for (int i = 0; i < size; i++) {
            System.out.println(zones[i]);
        }
    }
}