import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variable to store the user input
        int number;

        // Prompt the user to enter an integer
        System.out.print("Enter a natural number: ");
        number = input.nextInt();

        // Check if the user entered a natural number (positive integer)
        if (number <= 0) {
            System.out.println(number + " is not a natural number.");
        } else {
            // Use a for loop to iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the Scanner object 
        input.close();
    }
}
