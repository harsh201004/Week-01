import java.util.Scanner;
public class TextSplit2D {

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
	
	public static String[] splitText(String str) {
        int length = stringLength(str);

        // Count the number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
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

        words[words.length - 1] = str.substring(start); 
        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i])); 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  enter the text
        System.out.print("Enter a line of text: ");
        String userInput = input.nextLine();

        // Split text into words
        String[] words = splitText(userInput);

        // Create a 2D array with words and their lengths
        String[][] wordsAndLengths = wordsWithLengths(words);

        // Display results in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] wordData : wordsAndLengths) {
            String word = wordData[0];
            int length = Integer.parseInt(wordData[1]); 
            System.out.println(word + "\t" + length);
        }
        input.close();
    }
}