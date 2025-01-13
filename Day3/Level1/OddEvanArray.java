import java.util.Scanner;
public class OddEvanArray {
	
	public static void main(String [] args){
	
	//take the input number from the user
	Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number :");
	int number = input.nextInt();
	
	//check the number is natural
	if(number < 1) {
		System.out.println("Error");
		return;
	}
	
	//create the even and odd array
	int[] evenArray = new int [(number / 2) + 1];
	int[] oddArray  = new int [(number / 2) + 1];
	
	//create even odd variable
	int evenIndex = 0;
	int oddIndex = 0;
	
	for(int i =0; i<number; i++){
		if(i % 2 == 0){
			evenArray[evenIndex] =i;
			evenIndex++;
		}else {
			oddArray[oddIndex] =i;
			oddIndex++;
		}
	}
		
		//print the odd numbers array
		System.out.print("Odd numbers: ");
			for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
			}
        System.out.println(); 

        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println(); // New line for better formatting
	
	}
}