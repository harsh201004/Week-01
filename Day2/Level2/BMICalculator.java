import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for weight, height, and BMI
        double weight, height, bmi;

        // Take user input for weight (in kg) and height (in cm)
        System.out.print("Enter weight in kg: ");
        weight = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        bmi = weight / (height * height);

        // Display the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on BMI values
        if (bmi < 18.4) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("You are overweight.");
        } else if(bmi >40.0) {
            System.out.println("You are obese.");
        }

        // Close the Scanner object 
        input.close();
    }
}
