import java.util.Scanner;
public class CompareSubstring {

    // Method to create a substring using charAt()
    public static String substringCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i); 
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsCharAt(String str1, String str2) {
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
        System.out.print("Enter the text: ");
        String text = input.next();

        System.out.print("Enter the start index: ");
        int start = input.nextInt();

        System.out.print("Enter the end index: ");
        int end = input.nextInt();

        // Validate indices
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid start or end index!");
            return;
        }

        // Create substring using charAt()
        String substringUCharAt = substringCharAt(text, start, end);

        // Create substring using built-in substring() method
        String substringBuiltInMethod = text.substring(start, end);

        // Compare the two substrings
        boolean areEqual = compareStringsCharAt(substringUCharAt, substringBuiltInMethod);

        // Display the results
        System.out.println("Substring using charAt(): " + substringUCharAt);
        System.out.println("Substring using built-in substring(): " + substringBuiltInMethod);
        System.out.println("Are the substrings equal? " + areEqual);
    }
}
