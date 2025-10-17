package userinputswithcli;

import java.util.Scanner;

/*
 *  Scanner class in java is used to read input stream from a source.
 *  This source can be a cli (command line) user input or a file.
 *  To read from cli, we should pass System.in whereas to read a file,
 *  we should pass file path.
 *  It works with IDE cli also.
 *
 *  Advantage - specific methods for all primitive inputs so no need to explicitly type-cast.
 */

public class ScannerInputExample {
    public static void main(String[] args) {
        // Creating object of Scanner class to ready input stream from system console.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter byte input:");
        byte byteInput = scan.nextByte();

        System.out.println("Enter short input:");
        short shortInput = scan.nextShort();

        System.out.println("Enter int input:");
        int integerInput = scan.nextInt();

        System.out.println("Enter long input:");
        long longInput = scan.nextLong();

        System.out.println("Enter float input:");
        float floatInput = scan.nextFloat();

        System.out.println("Enter double input:");
        double doubleInput = scan.nextDouble();

        System.out.println("Enter boolean input:");
        boolean booleanInput = scan.nextBoolean();

        System.out.println("Enter string input without whitespaces. If you enter a white space, the string input will be trim after 1st white space occurrence:");
        String stringWithoutWhiteSpaces = scan.next();

        scan.nextLine();

        System.out.println("Enter String input with whitespaces:");
        String stringWithWhiteSpaces = scan.nextLine();

        // Close the scanner object if its no longer in use.
        scan.close();

        System.out.println();
        System.out.println("Below are your inputs:");
        System.out.println("byteInput: "+byteInput);
        System.out.println("shortInput: "+shortInput);
        System.out.println("integerInput: "+integerInput);
        System.out.println("longInput: "+longInput);
        System.out.println("floatInput: "+floatInput);
        System.out.println("doubleInput: "+doubleInput);
        System.out.println("booleanInput: "+booleanInput);
        System.out.println("stringWithoutWhiteSpaces: "+stringWithoutWhiteSpaces);
        System.out.println("stringWithWhiteSpaces: "+stringWithWhiteSpaces);
    }
}
