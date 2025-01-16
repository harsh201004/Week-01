import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare the variable for the user's input
        int number;

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Check if the input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to the input number
            for (int i = 1; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                // If not divisible by 3 or 5, print the number
                else {
                    System.out.println(i);
                }
            }
        }

        // Close the Scanner object 
        input.close();
    }
}
