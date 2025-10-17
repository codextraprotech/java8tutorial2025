package arraysinjava;

import java.util.Scanner;

public class DynamicArray1DExample {
    public static void main(String[] args) {
        // Dynamic 1D Array in java using new keyword method.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = scanner.nextInt();
        int[] dynamicArray1D = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("dynamicArray1D["+i+"]=");
            int input = scanner.nextInt();
            dynamicArray1D[i] = input;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(dynamicArray1D[i]);
        }
    }
}
