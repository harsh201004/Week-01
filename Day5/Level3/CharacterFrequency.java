import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store the frequency of ASCII characters
        int length = findLength(text);

        // Count the frequency of each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Store character
                result[index][1] = Integer.toString(frequency[i]); // Store frequency
                index++;
            }
        }

        return result;
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

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] data) {
        System.out.println("Character | Frequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find the frequency of characters
        String[][] frequencyData = findFrequency(text);

        // Display the result
        displayResult(frequencyData);
    }
}