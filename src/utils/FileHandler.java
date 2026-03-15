package utils;

import java.io.*;
import java.util.*;

public class FileHandler {

    public List<String> readFile(String fileName) {

        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }

        return lines;
    }
}