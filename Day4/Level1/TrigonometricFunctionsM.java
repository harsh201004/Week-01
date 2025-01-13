import java.util.Scanner;

public class TrigonometricFunctionsM {

    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] results = new double[3]; 

        // angle to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        results[0] = Math.sin(radians); 
        results[1] = Math.cos(radians); 
        results[2] = Math.tan(radians); 

        return results;
    }

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Take user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        
        double[] results = calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.println("Trigonometric functions for angle " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        input.close();
    }
}
