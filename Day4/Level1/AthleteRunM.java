import java.util.Scanner;

public class AthleteRunM {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds the athlete needs to run 5 km
    public static double calculateRounds(double perimeter) {
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the sides of the triangle in one line
        System.out.print("Enter the sides of the triangle in meters separated by spaces: ");
        String line = input.nextLine();
        
        // Split the input string into an array of strings and convert to doubles
        String[] sides = line.split(" ");
        double side1 = Double.parseDouble(sides[0]);
        double side2 = Double.parseDouble(sides[1]);
        double side3 = Double.parseDouble(sides[2]);

        // Calculate the perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate the number of rounds needed to complete 5 km
        double rounds = calculateRounds(perimeter);

        // Output the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        input.close();
    }
}
