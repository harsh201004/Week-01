import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
	
        //user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Compute the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2);

        
    }
}
