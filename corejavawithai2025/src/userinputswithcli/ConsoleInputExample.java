package userinputswithcli;

import java.io.Console;

/*
 *  Console class in java is used to read user input from a CLI console only.
 *  It does not work with IDE (Integrated Development Environment) cli, so we must use command prompt for this program.
 *
 *  Advantage - When reading password in CLI, it reads securely without displaying password
 *  in console.
 */
public class ConsoleInputExample {
    public static void main(String[] args) {
        Console console = System.console(); // Obtain the Console instance

        if (console != null) { // Check if a console is available
            String username = console.readLine("Enter username: ");
            char[] password = console.readPassword("Enter password: ");

            System.out.println("Username: " + username);
            // Convert char array to String for display (for practical use, hash the password)
            System.out.println("Password: " + new String(password));
        } else {
            System.out.println("No console available.");
        }
    }
}
