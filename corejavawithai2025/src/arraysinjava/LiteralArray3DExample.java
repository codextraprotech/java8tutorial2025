package arraysinjava;

public class LiteralArray3DExample {
    public static void main(String[] args) {
        // constant 3D Array in java using literal method.
        int[][][] literalArray3D = {{{1,2},{4,5}},{{6},{7,8}}, {{9,3}, {11, 10, 12}}};
        for (int x = 0; x < literalArray3D.length; x++) {
            for (int y = 0; y < literalArray3D[x].length; y++) {
                for (int z = 0; z < literalArray3D[x][y].length; z++) {
                    System.out.print(literalArray3D[x][y][z]+" ");
                }
                System.out.println();
            }
            System.out.println("=====");
        }
    }
}
