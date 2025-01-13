import java.util.Scanner;

public class FactorsM {

    // Method to find factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // array for factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

   
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

   
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            
            int[] factors = findFactors(number);

           
            int sum = calculateSum(factors);
            long product = calculateProduct(factors);
            int sumOfSquares = calculateSumOfSquares(factors);

            // Display the factors
            System.out.print("Factors of " + number + " are: ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();

            // Display the results
            System.out.println("Sum of the factors: " + sum);
            System.out.println("Product of the factors: " + product);
            System.out.println("Sum of the squares of the factors: " + sumOfSquares);
        }
        input.close();
    }
}
