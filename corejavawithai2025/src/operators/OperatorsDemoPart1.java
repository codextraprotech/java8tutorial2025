package operators;
/*
* Operators means special symbols
* that can perform some calculations to evaluate some results.
*
* Categories of Operators:
* 1. Arithmetic Operators: + - * / % () []
* 2. Unary Operators: + - ++ --
* 3. Assignment Operators: = += -= *= /= %=
* 4. Conditional/Relational/Comparison Operators: == != > < >= <=
* 5. Logical Operators: && || !
* 6. Bitwise Operators: & | ~ ^ << >> >>>
* 7. Ternary Operator: ?:
* 8. Instance of Operator: instanceof
*/

public class OperatorsDemoPart1 {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println("Arithmetic Operations");
        System.out.println(5+6);
        System.out.println(11-3);
        System.out.println(a*b);
        System.out.println(5.6/1.2);
        System.out.println(12%5);

        System.out.println("Unary Operations");
        int num1 = 5;
        int num2 = 5;
        System.out.println(+6);
        System.out.println(-6);
        System.out.println(++num1); // pre-increment
        System.out.println(num1);
        System.out.println(num1++); // post-increment
        System.out.println(num1);
        System.out.println(--num2); // pre-decrement
        System.out.println(num2);
        System.out.println(num2--); // post-decrement
        System.out.println(num2);

        System.out.println("Assignment Operators");
        int x = 5;
        System.out.println(x);
        x += 3; // x = x+3;
        System.out.println(x);
        x -= 1; // x = x - 1
        System.out.println(x);
        x *= 5; // x = x * 5 = 7*5
        System.out.println(x);
        x /= 2;
        System.out.println(x);
        x %= 3; // x= x % 3 = 17 % 3
        System.out.println(x);

        System.out.println("Conditional Operators:");
        System.out.println(3 == 3);
        System.out.println(3 == 4);
        System.out.println(3 != 3);
        System.out.println(3 != 4);
        System.out.println(3 < 4);
        System.out.println(4 < 3);
        System.out.println(3 < 3);
        System.out.println(3 > 4);
        System.out.println(4 > 3);
        System.out.println(3 > 3);
        System.out.println(3 <= 3);
        System.out.println(4 >= 4);
        System.out.println(4 >=3);
        System.out.println(3 >= 4);
    }
}
