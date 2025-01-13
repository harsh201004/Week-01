import java.util.Scanner;

public class SmallestAndLargestM {

    // Method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];  

        // Find the smallest
        result[0] = Math.min(number1, Math.min(number2, number3));

        // Find the largest
        result[1] = Math.max(number1, Math.max(number2, number3));

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user input    
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Output the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        input.close();
    }
}
