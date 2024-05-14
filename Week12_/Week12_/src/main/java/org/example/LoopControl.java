package org.example;

/**
 * This class demonstrates various looping operations.
 */
public class LoopControl {

    /**
     * Calculates the sum of squares of the first 10 positive integers.
     *
     * @return The sum of squares of the first 10 positive integers.
     */
    public int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * Outputs a right-angled triangle of height 5 made of asterisks.
     */
    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Demonstrates incorrect modification of the loop control variable.
     */
    public void modifyIndexIncorrectly() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                int adjustedValue = m + 3; // Calculate the adjusted value without modifying m
                System.out.println("to " + adjustedValue);
            }
        }
    }
}
