import java.util.Scanner;

public class TeamBMI {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Create arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Take input for the height and weight of the persons
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter the height in meters of person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            System.out.print("Enter the weight in kg of person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]); // BMI calculation

            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
		System.out.println("\nPerson Details:");
		System.out.println("Height (m)    Weight (kg)    BMI    Weight Status");
			for (int i = 0; i < numPersons; i++) {
				System.out.println("Height: " + heights[i] + " m");
				System.out.println("Weight: " + weights[i] + " kg");
				System.out.println("BMI: " + bmis[i]);
				System.out.println("Weight Status: " + weightStatus[i]);
				System.out.println(); // Adds a blank line between persons
}       
    }
}
