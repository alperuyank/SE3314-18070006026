package org.example;

/**
 * Represents a character in the Lord of the Rings universe.
 */
public class Character {
    /**
     * The name of the character.
     */
    private final String name;

    /**
     * The race of the character.
     */
    private final String race;

    /**
     * The age of the character.
     */
    private final int age;

    /**
     * Constructs a character with the given name, race, and age.
     *
     * @param name The name of the character.
     * @param race The race of the character.
     * @param age The age of the character.
     */
    public Character(final String name, final String race,final int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    /**
     * Prints details about the character.
     */
    public void printDetails() {
        if (race.equals("Hobbit")) {
            System.out.println("Character is a Hobbit");
        } else if (age >= 50) {
            System.out.println("Character is 50 or older");
        } else if (name.equals("Frodo")) {
            System.out.println("Character is Frodo");
        } else if (name.equals("Gandalf")) {
            System.out.println("Character is Gandalf");
        }
    }
}
