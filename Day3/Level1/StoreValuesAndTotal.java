import java.util.Scanner;

public class StoreValuesAndTotal {
    public static void main(String[] args) {
	
        // Create an array of size 10 of double type
        double[] numbers = new double[10];
        double total = 0.0; 
        int index = 0; 

        Scanner sc = new Scanner(System.in);

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number : ");
            double input = sc.nextDouble();

            // Check input is 0 or negative
            if (input <= 0) {
                break; 
            }

            // Check if reached the maximum size
            if (index >= 10) {
                System.out.println("Maximum limit reached.");
                break; 
            }

            // Store the number in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the total of the numbers 
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the total
        System.out.println("Total: " + total);
    }
}