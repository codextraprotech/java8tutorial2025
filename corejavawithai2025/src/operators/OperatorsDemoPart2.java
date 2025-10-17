package operators;

public class OperatorsDemoPart2 {
    public static void main(String[] args) {
        boolean inputTrue = true;
        boolean inputFalse = false;
        System.out.println("Logical Operators:");
        System.out.println("AND (&&) Operator:");
        System.out.println(inputTrue && inputTrue);
        System.out.println(inputTrue && inputFalse);
        System.out.println(inputFalse && inputTrue);
        System.out.println(inputFalse && inputFalse);
        System.out.println("OR (||) Operator:");
        System.out.println(inputTrue || inputTrue);
        System.out.println(inputTrue || inputFalse);
        System.out.println(inputFalse || inputTrue);
        System.out.println(inputFalse || inputFalse);
        System.out.println("NOT (!) Operator:");
        System.out.println(!inputTrue);
        System.out.println(!inputFalse);
        System.out.println();

        // Bitwise Operators: converts value to bits and then operates.
        System.out.println("Bitwise Operators:");
        // 00000011 & 00000101 = 00000001
        System.out.println(3 & 5); // bitwise AND
        // 00000011 | 00000101 = 00000111
        System.out.println(3 | 5); // bitwise OR
        // !00000011 = 11111100 = -4
        System.out.println(~3);    // bitwise NOT
        // 00000011 ^ 00000101 = 00000110 = 6
        System.out.println(3 ^ 5); // bitwise XOR
        System.out.println(3 << 1); // signed left shift
        System.out.println(-3 << 1); // signed left shift
        System.out.println(3 >> 1); // signed right shift
        System.out.println(-3 >> 1); // signed right shift
        System.out.println(3 >>> 1);// unsigned right shift
        System.out.println(-3 >>> 1);// unsigned right shift
        System.out.println();

        //Ternary Operator -> condition? ifTrue : ifFalse
        System.out.println("Ternary Operator");
        System.out.println(3 < 4 ? "True" : "False");
        System.out.println(3 > 4 ? "True" : "False");

        //instanceof Operator: checks if a value is instance/object of a class.
        System.out.println("instanceof Operator");
        System.out.println("Is it String instance?" instanceof String);
    }
}
