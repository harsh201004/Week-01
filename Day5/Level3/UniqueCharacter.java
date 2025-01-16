import java.util.Scanner;
public class UniqueCharacter {

    // Method to calculate the length of a string 
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = findLength(str);
        char[] uniqueCharacters = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueCharacters[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the array
            if (isUnique) {
                uniqueCharacters[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharacters[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(userInput);

        // Display the result
        System.out.println("Unique characters:");
        for (char c : uniqueChars) {
            System.out.println(c);
        }
        input.close();
    }
}
