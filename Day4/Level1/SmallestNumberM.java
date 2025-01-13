import java.util.Scanner;

public class SmallestNumberM {

    // Method to find the smallest number
    public static int findSmallestNumber(int[] numbers) {
        int smallest = numbers[0]; 

        //  find the smallest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest)
			{
                smallest = numbers[i]; 
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Get the numbers from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Call the method to find the smallest number
        int smallest = findSmallestNumber(numbers);

        // Output the result
        System.out.println("The smallest number is: " + smallest);

        input.close();
    }
}
