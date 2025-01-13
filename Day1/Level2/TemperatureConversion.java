import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        // user input
        Scanner scanner = new Scanner(System.in);

        //enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
   }
}