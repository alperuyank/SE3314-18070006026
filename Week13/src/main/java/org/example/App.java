package org.example;

import java.io.FileNotFoundException;

/**
 * Simulates a basic quest in Middle-earth.
 */
public final class App {

    /**
     * The age of Frodo.
     */
    private static final int FRODO_AGE = 33;

    /**
     * The age of Aragorn.
     */
    private static final int ARAGORN_AGE = 87;

    /**
     * Private constructor to prevent instantiation.
     */
    private App() {
        // Prevent instantiation
    }

    /**
     * Entry point for the Middle-earth quest simulation.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        try {
            Character frodo = new Character("Frodo", FRODO_AGE);
            Character aragorn = new Character("Aragorn", ARAGORN_AGE);
            MiddleEarthMap map = new MiddleEarthMap();
            Quest quest = new Quest("Destroy the One Ring", frodo, map);

            quest.addParticipant(aragorn);
            quest.start();
        } catch (FileNotFoundException e) {
            System.err.println("Error: Map file not found.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
