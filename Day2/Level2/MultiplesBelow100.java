import java.util.Scanner;

public class MultiplesBelow100 {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare the variable for the number
        int number;

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Check if the number is positive and greater than 0
        if (number > 0) {
            System.out.println("The multiples of " + number + " below 100 are:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the number
                if (i % number == 0) {
                    System.out.println(i);  // Print the multiple
                }
            }
        } else {
            System.out.println("Please enter a positive integer greater than 0.");
        }

        // Close the scanner object
        input.close();
    }
}
