import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for the user's input number
        int number; // The number provided by the user

        // Prompt the user for input
        System.out.print("Enter a number: ");
        number = input.nextInt(); // User's input for the number

        // Check if the number is a positive integer (natural number)
        if (number > 0) {
            // Calculate the sum of the first 'number' natural numbers
            int sum = number * (number + 1) / 2;
            // Output the sum
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner object
        input.close();
    }
}
