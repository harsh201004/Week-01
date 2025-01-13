import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] harsh) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total to 0.0
        double total = 0.0;

        // Create a variable to store the user input
        double userInput;

        // the first input
        System.out.print("Enter a number (enter 0 to stop): ");
        userInput = scanner.nextDouble();

        // While loop to add numbers until the user enters 0
        while (userInput != 0) {
            total += userInput;  
            System.out.print("Enter a number (enter 0 to stop): ");
            userInput = scanner.nextDouble();  // Get the next number
        }

        // Display the total value after the loop ends
        System.out.println("The total sum is: " + total);
    }
}