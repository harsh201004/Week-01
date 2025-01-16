import java.util.Scanner;

public class NumberSignCheck {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for the number
        int number; // The number provided by the user
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextInt(); // User input for the number

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If the number is positive
            System.out.println("Positive");
        } else if (number < 0) {
            // If the number is negative
            System.out.println("Negative");
        } else {
            // If the number is zero
            System.out.println("Zero");
        }
        
        // Close the Scanner object
        input.close();
    }
}
