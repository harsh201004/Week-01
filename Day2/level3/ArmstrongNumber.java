import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number, originalNumber, sum = 0, digit;

        // Take user input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Store the original number for later comparison
        originalNumber = number;

        // Use a while loop to extract each digit of the number
        while (number != 0) {
            // Find the last digit of the number
            digit = number % 10;

            // Calculate the cube of the digit and add to sum
            sum += Math.pow(digit, 3);

            // Remove the last digit from the number
            number /= 10;
        }

        // Compare the sum of the cubes of digits with the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner object
        input.close();
    }
}
