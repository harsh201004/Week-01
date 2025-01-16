import java.util.Scanner;

public class BMI_Calculator {

    // Method to compute BMI and status based on weight and height
    public static String[] calculateBMIAndStatus(double weight, double heightInCm) {
        double heightInM = heightInCm / 100;  // Convert height from cm to meters
        double bmi = weight / (heightInM * heightInM);  // Calculate BMI
        String status = "";

        // Determine BMI status
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25.0 && bmi < 39.9) {
            status = "Overweight";
        } else if(bmi >=40.0){
            status = "Obese";
        }

        // Return the BMI and status as a string array
        return new String[]{String.format("%.2f", bmi), status};
    }

    // Method to process all persons and return the 2D array of height, weight, BMI, and status
    public static String[][] processBMIData(double[][] data) {
        String[][] result = new String[data.length][4];  // 2D array to store height, weight, BMI, and status
        
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];

            // Call the method to calculate BMI and status
            String[] bmiAndStatus = calculateBMIAndStatus(weight, heightInCm);

            // Store the height, weight, BMI, and status in the result array
            result[i][0] = String.valueOf(heightInCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiAndStatus[0];  // BMI
            result[i][3] = bmiAndStatus[1];  // Status
        }
        return result;
    }

    // Method to display the 2D array of height, weight, BMI, and status in a tabular format
    public static void displayBMIReport(String[][] data) {
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");
       // System.out.println("-----------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a 2D array to store weight and height data for 10 persons
        double[][] personData = new double[10][2];  // 10 rows, 2 columns (weight and height)

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

        // Process the BMI data for all persons and get the result in a 2D array
        String[][] bmiReport = processBMIData(personData);

        // Display the BMI report in a tabular format
        displayBMIReport(bmiReport);

        // Close the scanner
        sc.close();
    }
}
