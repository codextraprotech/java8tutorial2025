package arraysinjava;

import java.util.Scanner;

public class DynamicArray2DExample {
    public static void main(String[] args) {
        // Dynamic 2D Array in java using new keyword method.
        Scanner sc = new Scanner(System.in);

        // Step 1: Get number of rows (first dimension length)
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Step 2: Declare the 2D array with variable second dimension
        int[][] jaggedArray = new int[rows][];

        // Step 3: For each row, get the length of that row (second dimension)
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];

            // Step 4: Take input for each element
            System.out.println("Enter " + cols + " elements for row " + i + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // Step 5: Display the jagged array
        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
