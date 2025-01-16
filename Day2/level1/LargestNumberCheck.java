import java.util.Scanner;

public class LargestNumberCheck {

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

        // Check if the first number is the largest
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

        // Check if the second number is the largest
        if (number2 >= number1 && number2 >= number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        // Check if the third number is the largest
        if (number3 >= number1 && number3 >= number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }

        // Close the Scanner object 
        input.close();
    }
}
