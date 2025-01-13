import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights 
        for (int i = 0; i <3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = input.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i <ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i <heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("The youngest friend is " + names[youngestIndex] + " with an age of " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with a height of " + heights[tallestIndex] + " cm.");

        input.close();
    }
}
