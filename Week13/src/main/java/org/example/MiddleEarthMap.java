package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a map of locations in Middle-earth.
 */
public class MiddleEarthMap {

    /** The list of locations in Middle-earth. */
    private ArrayList<String> locations;

    /**
     * Creates a new Middle Earth Map object from a file.
     *
     * @throws FileNotFoundException if the map file (map.txt) is not found.
     */
    public MiddleEarthMap() throws FileNotFoundException {
        locations = new ArrayList<>();
        loadLocations("map.txt");
    }

    /**
     * Loads locations from a text file.
     *
     * @param fileName The name of the file containing map locations.
     * @throws FileNotFoundException if the file is not found.
     */
    private void loadLocations(final String fileName)
            throws FileNotFoundException {
        locations = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            locations.add(scanner.nextLine());
        }
        scanner.close(); // Added to close the scanner
    }

    /**
     * Retrieves the list of locations.
     *
     * @return The list of locations.
     */
    public ArrayList<String> getLocations() {
        return locations;
    }
}
