import java.util.Scanner;
public class ReturnTheChar {

    
    public static char[] characters(String test) {
        char[] characters = new char[test.length()]; 
        for (int i = 0; i < test.length(); i++) {
            characters[i] = test.charAt(i);
        }
        return characters;
    }

    
    public static boolean compareStringArray(char[] str1, char[] str2) {
        if (str1.length != str2.length) {
            return false;
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = input.next();

        // Getting characters using the user-defined method
        char[] userDefinedChars = characters(str);

        // Getting characters using the built-in toCharArray() method
        char[] builtInChars = str.toCharArray();

        
        boolean areEqual = compareStringArray(userDefinedChars, builtInChars);

        // Displaying the results
        System.out.println("Characters using user-defined method:");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters using built-in toCharArray() method:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both character arrays equal? " + areEqual);
        input.close();
    }
}
