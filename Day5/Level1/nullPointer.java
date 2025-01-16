import java.util.Scanner;
public class nullPointer {

	public static void exception(){
	
		String str = null;
		
		System.out.println("Attempting to call length() on a null reference...");
        System.out.println("Length of text: " + str.length()); 
	}
	
	public static void handleException() {
        String str = null; 
        try {
            
            System.out.println("Attempting to call length() on a null reference...");
            System.out.println("Length of text: " + str.length());
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("Caught a NullPointerException! The variable 'str' is null.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        try {
            exception();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: NullPointerException occurred.");
        }

        System.out.println("\nDemonstrating Exception Handling:");
        handleException();
    }
}
