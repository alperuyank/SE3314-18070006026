package org.example;

/**
 * Represents a quest in the Lord of the Rings universe.
 */
public class Quest {
    public Quest() {
    }

    /**
     * Completes the quest based on the given points and whether the character is a ring bearer.
     *
     * @param points The points earned during the quest.
     * @param isRingBearer Indicates whether the character is a ring bearer.
     * @return True if the quest is successfully completed, otherwise false.
     */
    public boolean completeQuest(final int points,final boolean isRingBearer) {
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50 && points < 100 && points % 2 == 0 && isQualified) {
            System.out.println("Qualified");
        }

        return points >= 100;
    }
}
