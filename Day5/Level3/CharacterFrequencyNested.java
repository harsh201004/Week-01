import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray(); // Convert string to char array
        int[] freq = new int[chars.length]; // Array to store frequency of each character

        // Outer loop to iterate through each character
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Skip characters already marked as counted
                freq[i] = 1; // Initialize frequency to 1

                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++; // Increment frequency
                        chars[j] = '0'; // Mark duplicate character
                    }
                }
            }
        }

        // Create a 1D String array to store characters and their frequencies
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Skip counted characters
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        // Resize the result array to contain only valid entries
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    // Method to display the frequency results
    public static void displayResult(String[] data) {
        System.out.println("Character Frequencies:");
        for (String entry : data) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Call the findFrequency method to compute frequencies
        String[] frequencyData = findFrequency(text);

        // Display the result
        displayResult(frequencyData);
    }
}
