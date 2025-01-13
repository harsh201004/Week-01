import java.util.Scanner;

public class WindChill {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Take input 
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed : ");
        double windSpeed = input.nextDouble();

        //check the wind speed
        if (windSpeed < 3) {
            System.out.println("Wind speed must be greater than or equal to 3 mph for the formula to be valid.");
        } else {
           
            double windChill = calculateWindChill(temperature, windSpeed);

            // Output the result
            System.out.println("The wind chill temperature is: " + windChill + " °F");
        }

        input.close();
    }
}
