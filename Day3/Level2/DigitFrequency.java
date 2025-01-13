import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create an array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Extract digits from the number and update frequency array
        while (number > 0) {
            int digit = number % 10;  
            frequency[digit]++;  
            number = number / 10;  
        }

        // Display the frequency of each digit (0-9)
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of Digit :" + i +" = " + frequency[i] + " times");
            }
        }
    }
}
