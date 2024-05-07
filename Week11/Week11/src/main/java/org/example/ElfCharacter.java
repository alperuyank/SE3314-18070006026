package org.example;

/**
 * Represents a new character in the Lord of the Rings universe.
 */
public class ElfCharacter extends Character {

    /**
     * Indicates whether the character is an archer.
     */

    private final boolean isArcher;

    /**
     * Constructs an ElfCharacter with the given name, age, and isArcher status.
     *
     * @param name The name of the character.
     * @param age The age of the character.
     * @param isArcher Indicates whether the character is an archer.
     */
    public ElfCharacter(final String name,final int age,final boolean isArcher) {
        super(name, "Elf", age);
        this.isArcher = isArcher;
    }

    /**
     * Prints details about the ElfCharacter, including their race and archer status.
     */
    @Override
    public void printDetails() {
        super.printDetails();
        if (isArcher) {
            System.out.println("Character is an archer");
        } else {
            System.out.println("Character is not an archer");
        }
    }
}
