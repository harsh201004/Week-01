import java.util.Scanner;

public class FactorialCalculator1 {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variable to store the user input
        int number;

        // Prompt the user to enter an integer
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Check if the user entered a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize variable to store the factorial result
            long factorial = 1;

            // Use a for loop to compute the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by the current number i
            }

            // Print the computed factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the Scanner object 
        input.close();
    }
}
