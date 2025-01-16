import java.util.Scanner;

public class TestSplitor {

    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {  // Infinite loop to get the last char of the string
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception stops the loop
        }
        return count;
    }

    // Method to split a string into words without using split()
    public static String[] textSplit(String str1) {
        int length = stringLength(str1);

        // Step 1: Count the number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // Step 3: Extract words using the space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = str1.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }
        words[words.length - 1] = str1.substring(start); // Last word
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter a line of text: ");
        String str2 = input.nextLine();

        // Split using the user-defined method
        String[] split = textSplit(str2);

        // Split using the built-in split() method
        String[] builtIn = str2.split(" ");

        // Compare the results
        boolean areEqual = compareStringArrays(split, builtIn);

        // Display results
        System.out.println("Words using custom split method:");
        for (String word : split) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtIn) {
            System.out.println(word);
        }

        System.out.println("\nAre both methods producing the same result? " + areEqual);
        input.close();
    }
}
