package org.example;

/**
 * Archer character class.
 */
public class Archer extends Character {
  /**
     * Constructor for Archer class.
     * @param name Name of the archer.
     * @param health Health points of the archer.
     * @param attackPower Attack power of the archer.
     */
  public Archer(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
    public void specialAttack(Character opponent) {
    opponent.takeDamage(attackPower + 20);
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
