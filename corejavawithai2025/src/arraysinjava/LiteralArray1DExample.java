package arraysinjava;

/*
* What are arrays?
* Arrays are homogenous (same data type) collection of objects/values.
* In java, arrays can be created using literal value or by dynamic array creation using new keyword.
* Arrays can be either single dimensional (1D) or multidimensional (2D, 3D, 4D... nD).
* Arrays are indexed collections, so we can get any value through its position index.
* For any array, index always begins from 0 (zero) and goes till arrayLength-1.
*/
public class LiteralArray1DExample {
    public static void main(String[] args) {
        // constant 1D Array in java using literal method.
        int[] literalArray1D = {1,2,3,4,5};
        for (int i = 0; i < literalArray1D.length; i++) {
            System.out.print(literalArray1D[i]);
        }
    }
}
