import java.util.Scanner;

public class NumberCheckM {

    // Method to check 
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1; 
        } else if (num < 0) {
            return -1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Call the method to check the number
        int result = checkNumber(number);

        // Output the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}
