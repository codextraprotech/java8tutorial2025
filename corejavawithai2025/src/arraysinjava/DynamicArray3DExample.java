package arraysinjava;

import java.util.Scanner;

public class DynamicArray3DExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input x dimension size (number of "blocks")
        System.out.println("Enter the number of x layers: ");
        int xSize = scanner.nextInt();

        int[][][] dynamicArray3D = new int[xSize][][];

        for (int x = 0; x < xSize; x++) {
            System.out.println("Enter number of y-rows for x = " + x + ": ");
            int ySize = scanner.nextInt();
            dynamicArray3D[x] = new int[ySize][];
            for (int y = 0; y < ySize; y++) {
                System.out.println("Enter number of z-elements for x = " + x + ", y = " + y + ": ");
                int zSize = scanner.nextInt();
                dynamicArray3D[x][y] = new int[zSize];
                for (int z = 0; z < zSize; z++) {
                    System.out.println("Enter value for literalArray3D[" + x + "][" + y + "][" + z + "]: ");
                    dynamicArray3D[x][y][z] = scanner.nextInt();
                }
            }
        }

        // Printing the array as specified in your loop
        for (int x = 0; x < dynamicArray3D.length; x++) {
            for (int y = 0; y < dynamicArray3D[x].length; y++) {
                for (int z = 0; z < dynamicArray3D[x][y].length; z++) {
                    System.out.print(dynamicArray3D[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println("======");
        }
    }
}
