import java.util.Scanner;

public class MultiplicationTable1 {
    public static void main(String[] args) {
        // Create a object to get user input
        Scanner input = new Scanner(System.in);
        
        // Get an integer input from the user
        System.out.print("Enter a number in the range of 6 to 9 to print its multiplication table: ");
        int number = input.nextInt();
        
        // Check number is within the valid range
        if (number < 6 || number > 9) {
            System.out.println("Invalid input.");
            return;
        }

        // Define an integer array to store the multiplication results
        int[] multiplicationResult = new int[10];

        // Using a for loop to find the multiplication table
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i; 
        }

        // Display the results 
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }
    }
}