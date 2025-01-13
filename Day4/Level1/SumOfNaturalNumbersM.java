import java.util.Scanner;

public class SumOfNaturalNumbersM {

    // Method to calculate the sum of first 'n' natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        // Use a for loop for input validation (e.g., 2 attempts)
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter a positive integer: ");
            n = input.nextInt();

            // If the input is positive, break the loop
            if (n > 0) {
                break;
            } else {
                // If the input is negative or zero, prompt the user again
                System.out.println("Please enter a positive integer.");
            }
        }

        // If the input is still invalid after 2 attempts, notify the user
        if (n <= 0) {
            System.out.println("Invalid input. Exiting program.");
            input.close();
            return; // Exit the program if input is still invalid
        }

        // Call the method to calculate the sum
        int sum = sumOfNaturalNumbers(n);

        // Output the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        input.close();
    }
}
