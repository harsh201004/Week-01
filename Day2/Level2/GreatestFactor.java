import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare a variable for the number and greatest factor
        int number, greatestFactor = 1;

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Check if the number is greater than 1 to have factors other than itself
        if (number > 1) {
            // Loop from the number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                // Check if i is a factor of the number
                if (number % i == 0) {
                    greatestFactor = i;  // Update greatest factor
                    break;  // Exit the loop as we have found the greatest factor
                }
            }

            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        } else {
            System.out.println("The number must be greater than 1.");
        }

        // Close the scanner object
        input.close();
    }
}
