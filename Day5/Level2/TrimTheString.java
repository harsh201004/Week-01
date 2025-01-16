import java.util.Scanner;
public class TrimTheString {

    // start and end points of the string without spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
    
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i); // Build the string by concatenating each character
        }
        return result;
    }
	

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = input.nextLine();

        // Use the custom trim method
        int[] trimIndices = findTrimIndices(userInput);
        String customTrimmed = createSubstring(userInput, trimIndices[0], trimIndices[1]);

        // Use the built-in trim() method
        String builtInTrimmed = userInput.trim();

        // Compare the results
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);

        // Display the results
        System.out.println("Custom trimmed string: [" + customTrimmed + "]");
        System.out.println("Built-in trimmed string: [" + builtInTrimmed + "]");
        System.out.println("Are both results the same ?  " + areEqual);
        input.close();
    }
}
