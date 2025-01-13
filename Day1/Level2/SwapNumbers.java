import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        //  user input
        Scanner scanner = new Scanner(System.in);

        //enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        //enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display numbers after swapping
        System.out.println("The swapped numbers are " + number1 + " and " + number2 );
    }
}
