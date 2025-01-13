import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the array to store digits
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                break; 
            }
            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }

        // Initialize variables for largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Loop to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
