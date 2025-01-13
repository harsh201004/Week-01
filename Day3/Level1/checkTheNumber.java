import java.util.Scanner;

public class checkTheNumber{
	
		public static void main(String[] args){
	
		//Create an array of size 10
		int[] numbers =  new int [5];
		Scanner input = new Scanner(System.in);
		
		//Take 5 inputs for the array
		for(int i=0; i<numbers.length; i++) {
		
			System.out.print("Enter the number " + (i + 1) + ": ");
			numbers[i] = input.nextInt();
		}
		
		//check the numbers 
		for (int i=0; i<numbers.length; i++){
			int number = numbers[i];
			
			if(number > 0){
				if(number % 2 ==0){
				System.out.println(number + " is positive and even.");
				}
			}
			else if(number < 0){
				System.out.println(number + " is negative.");
			}
			else {
				System.out.println(number + " is zero.");
			}
			
		}
		
		//Declare the first and last element of the array
		int firstElement = numbers[0];
		int lastElement  = numbers[4];
		
		//check first element is greater or not than last element
		if(firstElement == lastElement){
			System.out.println("First element is equal to the lastElement.");
		}
		else if(firstElement > lastElement){
			System.out.println("First element is greater than lastElement.");
		}
		else {
			System.out.println("First element is less than lastElement.");
		}
	}
}