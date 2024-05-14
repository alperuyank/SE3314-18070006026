package org.example;

/**
 * This class demonstrates various array and matrix operations.
 */
public class ExampleUsage {

    /**
     * Filters and counts even numbers in an array using a foreach loop.
     *
     * @return The count of even numbers in the array.
     */
    public int filterAndCountEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
                count++;
            }
        }
        return count;
    }

    /**
     * Calculates the sum of diagonal elements of a 3x3 matrix.
     *
     * @return The sum of diagonal elements of the matrix.
     */
    public int matrixDiagonalSum() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    /**
     * Sums an array of integers.
     *
     * @return The total sum of the array.
     */
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0; // Correct usage of variable scope
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    /**
     * Processes a matrix by iterating over each row and column.
     */
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Iterate over each row and column of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }
}
