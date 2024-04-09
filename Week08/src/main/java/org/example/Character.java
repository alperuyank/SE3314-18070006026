package org.example;

/**
 * Abstract class representing a character in the game.
 */
public abstract class Character {
  protected String name;
  protected int health;
  protected int attackPower;

  /**
   * Constructor for the Character class.
   * @param name Name of the character.
   * @param health Health points of the character.
   * @param attackPower Attack power of the character.
   */
  public Character(String name, int health, int attackPower) {
    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
  }

  /**
   * Getter for the name of the character.
   * @return The name of the character.
   */
  public String getName() {
    if (name != null) {
      return name;
    } else {
      return "Unknown";
    }
  }
  /**
   * Getter for the health points of the character.
   * @return The health points of the character.
   */

  public int getHealth() {
    return health;
  }

  /**
   * Method to apply damage to the character.
   * @param damage The amount of damage to apply.
   *
   */

  public void takeDamage(int damage) {
    health -= damage;
  }

  /**
  * Abstract method representing a special attack action for the character.
  * @param opponent The opponent character to perform the special attack on.
  */
  public abstract void specialAttack(Character opponent);

  /**
     * Method to check if the character is defeated.
     * @return True if the character is defeated, false otherwise.
     */
  public boolean isDefeated() {
    return health <= 0;
  }

  /**
     * Abstract method representing a defend action for the character.
     * @param opponent The opponent character to perform the special attack on.
     */
  public abstract void defend(Character opponent);
}
