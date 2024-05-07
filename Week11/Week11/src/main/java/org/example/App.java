package org.example;

/**
 * Main class to demonstrate interactions within the Lord of the Rings universe.
 */
public final class App {
    private App() {
    }

    /**
     * Main method to start the application.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {
        Character frodo = new Character("Frodo", "Hobbit", 50);
        frodo.printDetails();

        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Mordor", false); // Added a boolean parameter to navigate()

        Quest quest = new Quest();
        quest.completeQuest(100, true); // Added a boolean parameter to completeQuest()
    }
}
