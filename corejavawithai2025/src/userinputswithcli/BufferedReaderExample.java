package userinputswithcli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*  BufferedReader class in java is used to read input stream from a source.
*  This source can be a cli (command line) user input or a file.
*  To read from cli, we should pass System.in whereas to read a file,
*  we should pass file path.
*  It works with IDE cli also.
*/

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        /// Step 1: create InputStreamReader object using either System.in for cli input or else file path for file inputs.
        InputStreamReader isr = new InputStreamReader(System.in);
        // Step 2: Create BufferedReader using InputStreamReader object
        BufferedReader reader = new BufferedReader(isr);

        // Step 3: we read the cli user input using readLine method
        System.out.print("Enter your password: ");
        String name = reader.readLine();
        // Step 4: process the input to provide a result.
        System.out.println("Hello, " + name + "!");
        // Step 5: Must close BufferedReader and InputStreamReader objects
        reader.close();
        isr.close();
    }
}
