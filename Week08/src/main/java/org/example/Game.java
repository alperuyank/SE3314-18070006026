package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Game class representing the game mechanics.
 */
public class Game {
  private List<Character> characters = new ArrayList<>();

  /**
     * Method to add a character to the game.
     *
     * @param character The character to add to the game.
     */
  public void addCharacter(Character character) {
        characters.add(character);
  }

  /**
     * Method to start the game and control the turn-based battle mechanics.
     */
  public void startGame() {
    int turn = 0;
    boolean gameOver = false;
    while (!gameOver) {
      Character attacker = characters.get(turn % characters.size());
      Character defender = characters.get((turn + 1) % characters.size());

      attacker.specialAttack(defender);
      System.out.println(attacker.getName() + " attacks " + defender.getName());

      if (defender.isDefeated()) {
        System.out.println(defender.getName() + " is defeated!");
        gameOver = true;
      }
      turn++;
    }
  }

  /**
     * Method to check if the game is over by determining if any character in the game is defeated.
     *
     * @return true if at least one character in the game is defeated, false otherwise.
  */
  private boolean isGameOver() {
    for (Character character : characters) {
      if (character.isDefeated()) {
        return true;
      }
    }
    return false;
    }
}
