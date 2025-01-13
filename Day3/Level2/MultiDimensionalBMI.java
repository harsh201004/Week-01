import java.util.Scanner;

public class MultiDimensionalBMI {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create a 2D array for storing height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3]; // Columns: [0] = Height, [1] = Weight, [2] = BMI
        String[] weightStatus = new String[numberOfPersons]; // Array to store weight status

        // Input height and weight for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            // Input and validate height
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            // Input and validate weight
            do {
                System.out.print("Enter weight (in kilograms): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            
            // Calculate BMI
            personData[i][2] = weight / (height * height);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
		System.out.println(); 
	for (int i = 0; i < numberOfPersons; i++) {
		System.out.println("Detail of person " + (i + 1) + ":");
    System.out.println("Height: " + personData[i][0] + " m");
    System.out.println("Weight: " + personData[i][1] + " kg");
    System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
    System.out.println("Weight Status: " + weightStatus[i]);
    System.out.println(); 
}
    }
}
