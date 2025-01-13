import java.util.Scanner;

public class TemperatureFahrenheitToCelsius {
    public static void main(String[] args) {
        //user input
        Scanner scanner = new Scanner(System.in);

        // enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble(); // Read the input as a double

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
    }
}