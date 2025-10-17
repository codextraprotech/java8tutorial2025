package arraysinjava;

public class LiteralArray2DExample {
    public static void main(String[] args) {
        // constant 2D Array in java using literal method.
        int[][] literalArray2D = {{1,2,3,4,5}, {6,7,8}};
        for (int i = 0; i < literalArray2D.length; i++) {
            System.out.print("Row["+i+"] Elements: ");
            for (int j = 0; j < literalArray2D[i].length; j++) {
                System.out.print(literalArray2D[i][j]);
            }
            System.out.println();
        }
    }
}