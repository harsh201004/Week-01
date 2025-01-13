import java.util.Scanner;
public class NaturalNumberSumM {

    // Recursive method to find the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;         }
        return n + sumUsingRecursion(n - 1); // Recursive step
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number): ");
        int n = input.nextInt();

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        // Calculate sum using recursion and formula
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        // Display results
        System.out.println("Sum of the " + n + " natural numbers using recursion: " + sumRecursion);
        System.out.println("Sum of the " + n + " natural numbers using formula: " + sumFormula);

        // Compare the results
        if (sumRecursion == sumFormula) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("Result is not same check the code.");
        }
        input.close();
    }
}