import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variable to store the user input number
        int number;

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its multiplication table: ");
        number = input.nextInt();

        // Use a for loop to generate and print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication result in the format: number * i = result
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the Scanner object
        input.close();
    }
}
