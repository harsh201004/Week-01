import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double total = 0.0; // Variable to store the sum of entered values
        double userInput; // Variable to store the user's input

        // Prompt the user to enter numbers
        System.out.println("Enter numbers to sum. Enter 0 to stop.");

        // Use a while loop to continue asking for numbers until 0 is entered
        while (true) {
            // Ask the user for input
            System.out.print("Enter a number: ");
            userInput = input.nextDouble(); // Read the user's input

            // Check if the user entered 0
            if (userInput == 0) {
                break; // Exit the loop if the user enters 0
            }

            // Add the entered value to the total
            total += userInput;
        }

        // After exiting the loop, print the total sum
        System.out.println("The total sum is: " + total);

        // Close the Scanner object 
        input.close();
    }
}
