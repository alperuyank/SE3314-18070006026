package org.example;

/**
 * This class contains a simple smoke test for the application.
 */
public class AppTest {

    /**
     * Runs the smoke test.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create instances of classes to test
        LoopControl loopControl = new LoopControl();

        // Run methods to ensure no exceptions are thrown
        loopControl.sumOfSquares();
        loopControl.printTriangle();
        loopControl.modifyIndexIncorrectly();

        ExampleUsage exampleUsage = new ExampleUsage();
        exampleUsage.filterAndCountEvenNumbers();
        exampleUsage.matrixDiagonalSum();
        exampleUsage.sumArray();
        exampleUsage.processMatrix();

        // If no exceptions are thrown, the smoke test passes
        System.out.println("Smoke test passed!");
    }
}
