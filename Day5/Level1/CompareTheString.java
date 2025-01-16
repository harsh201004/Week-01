import java.util.Scanner;
public class CompareTheString {

	
	
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
	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first string:");
        String str1 = input.next();
        System.out.println("Enter the second string:");
        String str2 = input.next();
		
		
		boolean charAtComparisonResult = compareStringsCharAt(str1, str2);

        // Comparing strings using built-in equals() method
        boolean equalsMethodResult = str1.equals(str2);
		
		
		System.out.println("Result of comparison using charAt(): " + charAtComparisonResult);
        System.out.println("Result of comparison using equals(): " + equalsMethodResult);

       
        if (charAtComparisonResult == equalsMethodResult) {
            System.out.println("Same strings");
        } else {
            System.out.println("Both are different strings.");
        }
        input.close();
    }
}