import java.util.Scanner;

public class DoubleOperation {

    public static void main(String[] args) {
	
        //user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double a, b, c;

        // Take user input for a, b, and c
        System.out.println("Enter the value of a:");
        a = scanner.nextDouble();

        System.out.println("Enter the value of b:");
        b = scanner.nextDouble();

        System.out.println("Enter the value of c:");
        c = scanner.nextDouble();

        // Perform operations and assign results to variables
        double result1 = a + b * c;     
        double result2 = a * b + c;     
        double result3 = c + a / b;      
        double result4 = a % b + c;     

        // Print the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

       
    }
}