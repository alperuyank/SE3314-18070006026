package org.example;

/**
 * The main application class to demonstrate loop and array operations.
 */
public class App {

    /**
     * The entry point of the application.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();

        // Task 1: Calculate the sum of squares of the first 10 positive integers
        System.out.println("Sum of squares of the first 10 positive integers: " + loopControl.sumOfSquares());

        // Task 2: Output a right-angled triangle of height 5 made of asterisks
        System.out.println("\nRight-angled triangle of height 5 made of asterisks:");
        loopControl.printTriangle();

        // Task 3: Demonstrate incorrect modification of loop control variable
        System.out.println("\nDemonstrating incorrect modification of loop control variable:");
        loopControl.modifyIndexIncorrectly();

        // Declare and initialize exampleUsage just before its first usage
        ExampleUsage exampleUsage = new ExampleUsage();

        // Task 4: Filter and count even numbers in an array using foreach loop
        System.out.println("\nCount of even numbers in the array: " + exampleUsage.filterAndCountEvenNumbers());

        // Task 5: Calculate the sum of diagonal elements of a 3x3 matrix
        System.out.println("\nSum of diagonal elements of a 3x3 matrix: " + exampleUsage.matrixDiagonalSum());

        // Method to sum an array of integers demonstrating the use of loops and variable scope
        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        // Example of using nested loops to process multidimensional data
        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}
