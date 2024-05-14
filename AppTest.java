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
        ExampleUsage exampleUsage = new ExampleUsage();

        // Run methods and assert expected results
        assert loopControl.sumOfSquares() == 385 : "Incorrect sum of squares";
        assert exampleUsage.matrixDiagonalSum() == 15 : "Incorrect diagonal sum";

        // If no exceptions are thrown and assertions pass, the smoke test passes
        System.out.println("Smoke test passed!");
    }
}
