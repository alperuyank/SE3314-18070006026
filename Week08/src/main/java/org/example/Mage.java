package org.example;

/**
 * Mage character class.
 */
public class Mage extends Character {
  /**
  * Constructor for Mage class.
  * @param name Name of the mage.
  * @param health Health points of the mage.
  * @param attackPower Attack power of the mage.
  */
  public Mage(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public void specialAttack(Character opponent) {
    opponent.takeDamage(attackPower + 50);
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
