package javastrings;
/*
* What is String?
* String is an array/set of characters.
* It may include any combination of letters, numbers and special characters.
*
* Strings in Java can be initialized in two ways -
* 1. Literal Object (Uses shared memory pool for common value objects)
* 2. Dynamic Object using new keyword (Uses individual memory from heap for each new object).
*/
public class StringExample {
    public static void main(String[] args) {
        // String as Literal Object
        String str1 = "This is 1st literal object of String class.";
        String str2 = "This is 2nd literal object of String class.";
        String commonStr1 = "Java";
        String commonStr2 = "Java";
        //String as dynamic object
        String str3 = new String("Java");
        String str4 = new String("Java");

    }
}
