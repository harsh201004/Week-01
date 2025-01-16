import java.util.Scanner;

public class SmallestNumberCheck {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for the three numbers
        int number1, number2, number3; // Input numbers

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        number1 = input.nextInt(); // User input for the first number
        
        System.out.print("Enter the second number: ");
        number2 = input.nextInt(); // User input for the second number
        
        System.out.print("Enter the third number: ");
        number3 = input.nextInt(); // User input for the third number

        // Check if the first number is the smallest
        if (number1 <= number2 && number1 <= number3) {
            // If the first number is smaller or equal to both the second and third numbers
            System.out.println("Is the first number the smallest? Yes");
        } else {
            // If the first number is not the smallest
            System.out.println("Is the first number the smallest? No");
        }
        
        // Close the Scanner object 
        input.close();
    }
}
