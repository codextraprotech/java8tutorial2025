package userinputswithcli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CompareScannerWithBufferedReader {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scanner class inputs");
        System.out.println("Enter 1st operand:");
        int operand1 = scanner.nextInt();
        System.out.println("Enter 2nd operand:");
        int operand2 = scanner.nextInt();
        System.out.println("Sum = "+(operand1 + operand2));

        System.out.println();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        System.out.println("BufferedReader class inputs");
        System.out.println("Enter 3rd operand:");
        String op1 = reader.readLine();
        int operand3 = Integer.parseInt(op1);
        System.out.println("Enter 4rth operand:");
        String op2 = reader.readLine();
        int operand4 = Integer.parseInt(op2);
        System.out.println("Sum = "+(operand3 + operand4));
    }
}
