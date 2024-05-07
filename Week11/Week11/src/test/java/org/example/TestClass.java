package org.example;

/**
 * Test class to demonstrate interactions between characters and quests.
 */
public class TestClass {
    // Hide the constructor to comply with the HideUtilityClassConstructor rule
    private TestClass() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Main method to test interactions between characters and quests.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {
        // Create a new ElfCharacter
        ElfCharacter legolas = new ElfCharacter("Legolas", 500, true);
        legolas.printDetails();

        // Create a new RescueMission quest
        Quest rescueMission = new Quest();

        // Attempt to complete the RescueMission quest with Legolas
        boolean isRescueSuccessful = rescueMission.completeQuest(100, true);
    }
}
