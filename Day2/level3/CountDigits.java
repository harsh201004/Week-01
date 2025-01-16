import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number, count = 0;

        // Take user input for the number
        System.out.print("Enter an integer: ");
        number = input.nextInt();

        // Check if the number is negative; if so, convert to positive
        number = Math.abs(number);

        // Loop to count the number of digits
        while (number != 0) {
            // Remove the last digit from the number
            number /= 10;

            // Increase the count for each digit removed
            count++;
        }

        // If the input number is 0, set count to 1 since 0 is a single digit
        if (count == 0) {
            count = 1;
        }

        // Display the result
        System.out.println("The number of digits is: " + count);

        // Close the scanner object
        input.close();
    }
}
