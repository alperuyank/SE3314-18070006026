package org.example;

import java.io.FileNotFoundException;

public class AppTest {

    public static void main(String[] args) {
        try {
            // Test Character class
            Character frodo = new Character("Frodo", 33);
            Character aragorn = new Character("Aragorn", 87);

            assert "Frodo".equals(frodo.getName()) : "Character name test failed for Frodo.";
            assert frodo.getAge() == 33 : "Character age test failed for Frodo.";
            assert "Aragorn".equals(aragorn.getName()) : "Character name test failed for Aragorn.";
            assert aragorn.getAge() == 87 : "Character age test failed for Aragorn.";

            System.out.println("Character tests passed.");

            // Test MiddleEarthMap class
            MiddleEarthMap map = new MiddleEarthMap();

            assert !map.getLocations().isEmpty() : "MiddleEarthMap locations test failed.";
            System.out.println("MiddleEarthMap test passed.");

            // Test Quest class
            Quest quest = new Quest("Destroy the One Ring", frodo, map);
            quest.addParticipant(aragorn);

            System.out.println("Quest Test:");
            quest.start();

            System.out.println("Quest test passed.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: Map file not found.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
