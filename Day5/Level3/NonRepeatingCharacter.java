import java.util.Scanner;

public class NonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters
        int length = findLength(text);

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        // Return a special character if no non-repeating character is found
        return '\0';
    }

    // Method to find the length of the string without using length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeating(text);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
