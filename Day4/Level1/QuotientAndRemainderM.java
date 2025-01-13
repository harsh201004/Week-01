import java.util.Scanner;

public class QuotientAndRemainderM {

    // Method to find the quotient and remainder
    public static int[] findQuotientAndRemainder(int dividend, int divisor) {
        int[] result = new int[2]; 
        result[0] = dividend / divisor; 
        result[1] = dividend % divisor; 
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input 
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Check if the divisor is not zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
			
        } else {
            // Call the method to calculate quotient and remainder
            int[] result = findQuotientAndRemainder(dividend, divisor);

            // Output the results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        input.close();
    }
}
