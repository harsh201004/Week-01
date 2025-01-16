import java.util.Scanner;

public class CharacterFrequencyUnique {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int length = findLength(text);
        char[] unique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        int uniqueCount = uniqueChars.length;

        // 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];

        for (int i = 0; i < uniqueCount; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Count the frequency of the current character
            for (int j = 0; j < findLength(text); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            result[i][0] = Character.toString(currentChar); // Store character
            result[i][1] = Integer.toString(frequency);     // Store frequency
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

        // Find the frequency of unique characters
        String[][] frequencyData = findFrequency(text);

        // Display the result
        displayResult(frequencyData);
    }
}
