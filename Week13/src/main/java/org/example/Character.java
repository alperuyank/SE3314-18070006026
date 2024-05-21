package org.example;

/**
 * Represents a character in a story.
 */
public class Character {

    /** The name of the character. */
    private final String name;

    /** The age of the character. */
    private final int age;

    /**
     * Constructs a new Character object.
     *
     * @param characterName The name of the character (should be non-null).
     * @param characterAge  The age of the character (should be non-negative).
     * @throws IllegalArgumentException if name is null or age is negative.
     */
    public Character(final String characterName,
                     final int characterAge) throws IllegalArgumentException {
        if (characterName == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        if (characterAge < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.name = characterName;
        this.age = characterAge;
    }

    /**
     * Retrieves the name of the character.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the age of the character.
     *
     * @return The age of the character.
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns a string representation of the character.
     *
     * @return The name of the character.
     */
    @Override
    public String toString() {
        return name;
    }
}
