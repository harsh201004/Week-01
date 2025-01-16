import java.util.Scanner;
public class NumberFormatExceptionDemo{

	public static void exception(String str){
	
	 System.out.println("Attempting to parse input to an integer...");
        int number = Integer.parseInt(str); 
        System.out.println("Parsed number: " + number);
	}
	
	public static void handleException(String str){
		try{
			exception (str);
		}catch(NumberFormatException e){
			 System.out.println("NumberFormatException caught: " + e.getMessage());
		}catch(RuntimeException e){
			System.out.println("RuntimeException caught: " + e.getMessage());
		}
	}
	
	public static void main(String [] args){
	
	Scanner input =new Scanner(System.in);
	
	System.out.print("Enter the string to parse as integer : ");
	String newInput = input.nextLine();
	
	try{
		exception(newInput);
	}catch(NumberFormatException e){
		System.out.println("NumberFormatException caught: " + e.getMessage());
	}
	
	handleException(newInput);
	input.close();
	}
}