import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the user input year
        int year;

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        year = input.nextInt();

        // Check if the year is >= 1582 (Gregorian calendar)
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582 as per the Gregorian calendar.");
        } else {
            // Check for leap year using multiple if-else conditions
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Close the Scanner object 
        input.close();
    }
}
