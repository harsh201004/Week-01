import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for number, power, and result
        int number, power, result = 1;

        // Take user input for the number and power
        System.out.print("Enter the base number: ");
        number = input.nextInt();

        System.out.print("Enter the power: ");
        power = input.nextInt();

        // Use a for loop to calculate the power of the number
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by the base number in each iteration
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner object
        input.close();
    }
}
