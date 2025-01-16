import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double first, second;
        String op;

        // Take user input for the first number, second number, and operator
        System.out.print("Enter first number: ");
        first = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = input.next();

        System.out.print("Enter second number: ");
        second = input.nextDouble();

        // Perform operations based on the operator using switch-case
        double result = 0;
        boolean isValidOperator = true;

        switch(op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    isValidOperator = false;
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                isValidOperator = false;
                System.out.println("Invalid Operator.");
        }

        // If operator is valid and division by zero is avoided, print the result
        if (isValidOperator) {
            System.out.println("Result: " + result);
        }

        // Close the scanner object
        input.close();
    }
}
