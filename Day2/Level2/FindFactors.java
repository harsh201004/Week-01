import java.util.Scanner;

public class FindFactors {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare the variable for the number
        int number;

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Check if the number is greater than 0
        if (number > 0) {
            System.out.println("The factors of " + number + " are:");
            
            // Loop through all integers from 1 to number - 1
            for (int i = 1; i <= number; i++) {
                // Check if i is a factor of number
                if (number % i == 0) {
                    System.out.println(i);  // Print the factor
                }
            }
        } else {
            System.out.println("Please enter a positive integer greater than 0.");
        }

        // Close the scanner object
        input.close();
    }
}
