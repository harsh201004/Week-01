import java.util.Scanner;
public class LengthOfString {
	
	// create a method to get the length of the string
	public static int stringLength(String str){
	
		int count =0;
		
		try{
			while(true) {  //infine loop to get the last char of the string 
				str.charAt(count);
				count++;
			}
		}catch(IndexOutOfBoundsException e) {
			//it throws the exception, with it the while loop stops
		}
		return count;
	}
	
	//main method
	public static void main(String [] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str1 = input.nextLine();
		
		//calculate the length with my method
		int myMethod = stringLength(str1);
		
		//calculate the length with the built in mathod
		int builtIN = str1.length();
		
		//results
		System.out.println("Length of the string using my method : " + myMethod );
		System.out.println("Length of the string using built in method : " + builtIN );
		input.close();
	}
}