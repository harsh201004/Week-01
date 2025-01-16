import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number;
        boolean isPrime = true; // Assume the number is prime initially

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is prime: ");
        number = input.nextInt();

        // Check for numbers less than or equal to 1 (they are not prime)
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number - 1 and check if the number is divisible by any number
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) { // If the remainder is 0, the number is divisible by i
                    isPrime = false;
                    break; // Exit the loop as we found a divisor
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the Scanner object 
        input.close();
    }
}
