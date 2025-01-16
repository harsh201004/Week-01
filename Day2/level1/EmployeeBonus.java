import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables to store salary and years of service
        double salary;
        int yearsOfService;

        // Prompt the user to enter the salary
        System.out.print("Enter the employee's salary: ");
        salary = input.nextDouble();

        // Prompt the user to enter the years of service
        System.out.print("Enter the employee's years of service: ");
        yearsOfService = input.nextInt();

        // Check if the employee is eligible for bonus
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of salary
            double bonus = salary * 0.05;

            // Print the bonus amount
            System.out.println("The employee is eligible for a bonus.");
            System.out.println("The bonus amount is: " + bonus);
        } else {
            // Inform the user if the employee is not eligible for bonus
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Close the Scanner object 
        input.close();
    }
}
