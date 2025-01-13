import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        //  user input
        Scanner scanner = new Scanner(System.in);

        //input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Ensure the year is greater than or equal to 1582 (Gregorian calendar)
        if (year < 1582) {
            System.out.println("The year must be 1582 or greater (Gregorian calendar).");
        } else {
            // Single if statement with logical operators to check leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}