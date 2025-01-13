import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        //user input
        Scanner scanner = new Scanner(System.in);

        // Principal  amount , Rate, and Time values
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + ".");
    }
}
