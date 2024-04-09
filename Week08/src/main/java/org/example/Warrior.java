package org.example;

/**
 * Warrior character class.
 */
public class Warrior extends Character {
  /**
  * Constructor for Warrior class.
  * @param name Name of the warrior.
  * @param health Health points of the warrior.
  * @param attackPower Attack power of the warrior.
     */
  public Warrior(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public void specialAttack(Character opponent) {
    opponent.takeDamage(attackPower * 2);
  }

  /**
   * Perform a defensive action as an archer.
   * When invoked, the archer takes evasive action to reduce incoming damage.
   * @param opponent The opponent character from which damage is to be reduced.
   */
  @Override
  public void defend(Character opponent) {
    int reducedDamage = (int) (0.8 * attackPower);
    opponent.takeDamage(reducedDamage);
  }
}
