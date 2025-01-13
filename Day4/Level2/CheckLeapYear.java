
import java.util.Scanner;
public class CheckLeapYear {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        return false;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Validate the year
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582. Enter a valid year.");
        }
        else {  
            boolean isLeap = isLeapYear(year);

            // Output the result
            if (isLeap) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }
        input.close();
    }
}

