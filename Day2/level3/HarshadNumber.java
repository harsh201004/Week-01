import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number, sum = 0, originalNumber;

        // Take user input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Store the original number for later comparison
        originalNumber = number;

        // Calculate the sum of the digits of the number
        while (number != 0) {
            // Extract the last digit of the number
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        // Close the scanner object
        input.close();
    }
}
