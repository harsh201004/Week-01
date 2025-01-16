import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variable to store the user input number
        int n;

        // Prompt the user to enter a natural number
        System.out.print("Enter a natural number: ");
        n = input.nextInt();

        // Check if the number is a valid natural number (positive integer)
        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            // Compute sum using the formula n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using a while loop
            int loopSum = 0;
            int counter = 1;
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }

            // Compare the results and print
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("The result is correct. Both methods give the same result.");
            } else {
                System.out.println("The result is incorrect. There is a discrepancy.");
            }
        }

        // Close the Scanner object 
        input.close();
    }
}
