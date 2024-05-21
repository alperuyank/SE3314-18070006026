package org.example;

import java.util.ArrayList;

/**
 * Represents a quest in Middle-earth.
 */
public class Quest {

    /** The name of the quest. */
    private final String name;

    /** The leader of the quest. */
    private final Character leader;

    /** The participants of the quest. */
    private final ArrayList<Character> participants;

    /** The map for the quest. */
    private final MiddleEarthMap map;

    /**
     * Creates a new Quest object.
     *
     * @param questName The name of the quest.
     * @param questLeader The leader of the quest (cannot be null).
     * @param questMap The map for the quest (cannot be null).
     * @throws IllegalArgumentException if leader or map is null.
     */
    public Quest(final String questName,
                 final Character questLeader,
                 final MiddleEarthMap questMap)
            throws IllegalArgumentException {
        if (questLeader == null) {
            throw new IllegalArgumentException("Quest leader cannot be null.");
        }
        if (questMap == null) {
            throw new IllegalArgumentException("Quest map cannot be null.");
        }
        this.name = questName;
        this.leader = questLeader;
        this.map = questMap;
        this.participants = new ArrayList<>();
    }

    /**
     * Adds a participant to the quest.
     *
     * @param character The character to add as a participant.
     */
    public void addParticipant(final Character character) {
        participants.add(character);
    }

    /**
     * Starts the quest and prints information about the quest,
     * leader, participants, and map locations.
     */
    public void start() {
        System.out.println("Starting quest: " + name);
        System.out.println("Leader: " + leader.getName());
        System.out.println("Participants:");
        for (Character participant : participants) {
            System.out.println(participant + ", age: " + participant.getAge());
        }
        System.out.println("Map locations:");
        for (String location : map.getLocations()) {
            System.out.println(location);
        }
    }
}
