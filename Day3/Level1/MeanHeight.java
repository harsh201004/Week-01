import java.util.Scanner;
public class MeanHeight {

	public static void main(String [] args){
	
	// Create an array of size 11 for heights of the 11 players
	double[] heights = new double [11];
	Scanner input = new Scanner(System.in);
	double sum = 0.0; 
	
	//Run a loop to get the input heights of each player from the user
	for(int i=0; i<heights.length; i++){
	System.out.print("Enter the height of the player " + (i+1) +":" );
	heights[i] = input.nextDouble();
		 sum += heights[i];
	}
	
	//calculate mean and desplay result
	double mean =sum/11;
	System.out.println("The mean of the players age is :" + mean );
	}
}