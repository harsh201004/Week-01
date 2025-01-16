import java.util.Scanner;
public class IllegalArgumentExceptionDemo{

	public static void exception(String str){
	
	int start = 4;
	int end =3;
	System.out.print("Attempting to extract substring...");
	
	String result = str.substring(start, end);
	System.out.print("Substring" + result );
	}
	
	public static void handleException(String str) {
	
	try{
		exception(str);
	}catch(IllegalArgumentException e) {
		System.out.println("IllegalArgumentException caught: " + e.getMessage());
    }catch(RuntimeException e){
		System.out.println("Runtime exception caught: " + e.getMessage());
	}
    }
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the string ");
		String str1 = input.nextLine();
		
	handleException(str1);
	input.close();
	}
}