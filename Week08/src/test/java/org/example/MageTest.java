package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MageTest {

    @Test
    public void testDefend() {
        // Create a mage character
        Mage mage = new Mage("Merlin", 100, 20);

        // Create an opponent character
        Character opponent = new Warrior("Opponent", 100, 20);

        // Record the opponent's initial health
        int opponentInitialHealth = opponent.getHealth();

        // Perform defend action
        mage.defend(opponent);

        // Calculate expected damage reduced by defend action
        int expectedReducedDamage = (int) (0.8 * mage.attackPower);

        // Calculate expected opponent health after defend action
        int expectedOpponentHealth = opponentInitialHealth - expectedReducedDamage;

        // Assert that opponent's health is reduced by expected amount after defend action
        assertEquals(expectedOpponentHealth, opponent.getHealth());
    }
}
