import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        //  user input
        Scanner scanner = new Scanner(System.in);

        //enter the salary
        System.out.print("Enter salary (INR): ");
        double salary = scanner.nextDouble();

        //enter the bonus
        System.out.print("Enter bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome );
    }
}