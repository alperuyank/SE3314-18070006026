package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case.
     *
     * @param testName name of the test case
     */
    public AppTest(final String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested.
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigorous Test for completing the RescueMission quest.
     */
    public void testRescueMissionQuestCompletion() {
        // Create a new RescueMission quest
        RescueMission rescueMission = new RescueMission();

        // Attempt to complete the RescueMission quest
        boolean isRescueSuccessful = rescueMission.completeQuest(100, true);

        // Assert that the quest is completed successfully
        assertTrue(isRescueSuccessful);
    }
}
