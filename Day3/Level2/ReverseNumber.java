import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        // Create an array to store the digits
        int[] digits = new int[digitCount];

        // Extract digits and store them in the array
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10; 
            number /= 10;
            index++;
        }

        // Display the elements of the digits array in reverse order
        System.out.print("The reversed number is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        
    }
}
