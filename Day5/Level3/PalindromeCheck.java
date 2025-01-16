import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from the start and end of the string
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Using recursion to compare characters from start and end
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reverse the string
    public static boolean isPalindromeLogic3(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];
        
        // Reverse the original array
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }
        
        // Compare original and reverse arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        // Check palindrome using Logic 1
        if (isPalindromeLogic1(text)) {
            System.out.println("Text is a palindrome (Logic 1).");
        } else {
            System.out.println("Text is not a palindrome (Logic 1).");
        }

        // Check palindrome using Logic 2
        if (isPalindromeLogic2(text, 0, text.length() - 1)) {
            System.out.println("Text is a palindrome (Logic 2).");
        } else {
            System.out.println("Text is not a palindrome (Logic 2).");
        }

        // Check palindrome using Logic 3
        if (isPalindromeLogic3(text)) {
            System.out.println("Text is a palindrome (Logic 3).");
        } else {
            System.out.println("Text is not a palindrome (Logic 3).");
        }

        scanner.close();
    }
}
