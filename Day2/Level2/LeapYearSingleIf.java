import java.util.Scanner;

public class LeapYearSingleIf {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the user input year
        int year;

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        year = input.nextInt();

        // Check if the year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582 as per the Gregorian calendar.");
        } else {
            // Single if statement with multiple logical conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Close the Scanner object 
        input.close();
    }
}
