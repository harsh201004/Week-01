import java.util.Scanner;
public class StringIndexOutOfBounds {

    
    public static void generateException(String str) {
        System.out.println("Attempting to access an index beyond the string length...");
        // Accessing an invalid index
        System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Attempting to access an index beyond the string length...");
            // Accessing an invalid index
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Caught a StringIndexOutOfBoundsException! The index is out of range.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = input.next();

        System.out.println("\nDemonstrating StringIndexOutOfBounds:");
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: StringIndexOutOfBounds occurred.");
        }

        System.out.println("\nDemonstrating Exception Handling:");
        handleException(userInput);

        input.close();
    }
}
