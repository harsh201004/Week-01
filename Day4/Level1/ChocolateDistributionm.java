import java.util.Scanner;

public class ChocolateDistributionm {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; 
        result[0] = number / divisor; 
        result[1] = number % divisor; 
        return result;
    }

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Take user input for number of chocolates and children
        System.out.print("Enter total chocolates: ");
        int totalChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Check if the number of children is not zero
        if (numberOfChildren == 0) {
            System.out.println("The number of children cannot be zero.");
        } 
		else {
            
            int[] result = findRemainderAndQuotient(totalChocolates, numberOfChildren);

            // Output the results
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
        input.close();
    }
}
