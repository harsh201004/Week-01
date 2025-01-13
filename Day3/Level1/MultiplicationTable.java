import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create object to get user input
        Scanner input = new Scanner(System.in);
        
        // input from the user
        System.out.print("Enter a number to print multiplication table: ");
        int number = input.nextInt();
        
        // Ceate array to store the results of multiplication from 1 to 10
        int[] multiplicationTable = new int[10];
        
        
        for (int i = 1; i <= 10; i++) {
			// Store the result in the array
            multiplicationTable[i - 1] = number * i; 
        }
        
        // Display the result
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
    }
}