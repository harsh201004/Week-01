import java.util.Scanner;
	public class FindFactors {
	
	public static void main(String [] args){
	
	// take input from the user
	Scanner input = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number =input.nextInt();
		
		int maxFactor = 10; 
        int[] factors = new int[maxFactor];
        int index = 0; 
		
		// check the factors
		for(int i=1; i<=number; i++){
			if(number % i == 0){
				if(index == maxFactor){
					maxFactor*= 2;
					int[] temp = new int[maxFactor];
					
					for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j]; 
                    }
					
					factors = temp;
				}
				factors[index++]= i;
			} 
			
		}
		
		// Display the factors of the number
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
	}
}