import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If the lengths are not equal, they can't be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters for both texts
        int[] frequency1 = new int[256]; // Assuming ASCII characters
        int[] frequency2 = new int[256];

        // Loop through the characters of both strings and count their frequencies
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays of both strings
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If frequencies don't match, they are not anagrams
            }
        }

        // If all frequencies match, they are anagrams
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for both texts
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams using the user-defined method
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}