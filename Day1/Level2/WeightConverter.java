import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
        //  user input
        Scanner scanner = new Scanner(System.in);

        // weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Display the results
        System.out.println("The weight of the person in pounds is " + weightInPounds +   " and in kilograms is " + weightInKilograms );
          }
        }
