import java.util.Scanner;

public class DivisibilityCheck {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Declare the variable for the user's input number
        int number; // The number provided by the user
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        number = input.nextInt(); // User's number input
        
        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            // If the number is divisible by 5
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            // If the number is not divisible by 5
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
        
        // Close the Scanner 
        input.close();
    }
}
