import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number, sum = 0;

        // Take user input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Run a for loop to find the divisors of the number
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                sum += i;  // Add the divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Close the scanner object
        input.close();
    }
}
