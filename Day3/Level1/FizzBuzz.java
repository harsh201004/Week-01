import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Invalid");
            return;
        }

        // Create a String array to save the results
        String[] results = new String[number + 1];

        // Loop from 0 to the number and populate the results array
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; 
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; 
            } else {
                results[i] = String.valueOf(i); 
            }
        }

        // Print the results in the specified format
        for (int i = 0; i < results.length; i++) {
            System.out.println( + i + " = " + results[i]);
        }
    }
}