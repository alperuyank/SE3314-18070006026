package org.example;

/**
 * Represents a new quest in the Lord of the Rings universe - RescueMission.
 */
public class RescueMission extends Quest {
    public RescueMission() {
    }

    /**
     * Completes the RescueMission quest.
     *
     * @param points The points earned during the quest.
     * @param isSuccessful Indicates whether the rescue was successful.
     * @return True if the quest is successfully completed, otherwise false.
     */
    @Override
    public boolean completeQuest(final int points,final boolean isSuccessful) {
        if (isSuccessful) {
            System.out.println("Rescue Mission completed successfully!");
            return true;
        } else {
            System.out.println("Rescue Mission failed.");
            return false;
        }
    }
}
