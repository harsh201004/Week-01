import java.util.Scanner;
public class AnalyzeTheString {

    
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception stops the loop
        }
        return count;
    }

    // Method to split a string into words without using split()
    public static String[] splitText(String str) {
        int length = findStringLength(str);

        // Step 1: Count the number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        //  Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // Extract words using the space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = str.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }
        words[words.length - 1] = str.substring(start); // Last word
        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(findStringLength(words[i])); // Length as a string
        }
        return result;
    }

    // Method to find the shortest and longest word
    public static String[] findShortestAndLongest(String[][] wordData) {
        String shortestWord = wordData[0][0];
        String longestWord = wordData[0][0];
        int shortestLength = Integer.parseInt(wordData[0][1]);
        int longestLength = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int currentLength = Integer.parseInt(wordData[i][1]);
            if (currentLength < shortestLength) {
                shortestWord = wordData[i][0];
                shortestLength = currentLength;
            }
            if (currentLength > longestLength) {
                longestWord = wordData[i][0];
                longestLength = currentLength;
            }
        }

        return new String[] { shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength) };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter text
        System.out.print("Enter a line of text: ");
        String userInput = input.nextLine();

        // Split text into words
        String[] words = splitText(userInput);

        // Create a 2D array with words and their lengths
        String[][] wordsAndLengths = wordsWithLengths(words);

        // Find shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsAndLengths);

        // Display results
        System.out.println("\nWords and their lengths:");
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] wordData : wordsAndLengths) {
            String word = wordData[0];
            int length = Integer.parseInt(wordData[1]); // Convert length back to integer
            System.out.println(word + "\t" + length);
        }

        System.out.println("\nShortest word: " + shortestAndLongest[0] + " (Length: " + shortestAndLongest[1] + ")");
        System.out.println("Longest word: " + shortestAndLongest[2] + " (Length: " + shortestAndLongest[3] + ")");
        input.close();
    }
}
