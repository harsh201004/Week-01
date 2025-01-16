import java.util.Scanner;
public class CheckVovelAndConsonant {

    // Method to check a character as Vowel, Consonant
    public static String classifyCharacter(char ch) {
        // Convert to lowercase if uppercase
        ch = Character.toLowerCase(ch);

        // Check if it is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to analyze the string 
    public static String[][] analyzeString(String str) {
        int length = str.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            result[i][0] = String.valueOf(currentChar); 
            result[i][1] = classifyCharacter(currentChar); 
        }
        return result;
    }

   
    public static void displayResults(String[][] data) {
		
        for (String[] row : data) {
            System.out.println(row[0] + " " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Analyze the string
        String[][] analysis = analyzeString(userInput);

        // Display the results
        displayResults(analysis);

        input.close();
    }
}