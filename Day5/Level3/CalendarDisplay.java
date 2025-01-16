import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a given month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in leap year has 29 days
        }
        return days[month - 1];
    }

    // Method to get the first day of the month (0=Sun, 1=Mon, ..., 6=Sat)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        
        if (m <= 2) {
            m += 12;
            y -= 1;
        }
        
        int x = y + y / 4 - y / 100 + y / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int firstDay = (1 + x + 31 * m0 / 12) % 7;
        return firstDay;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        
        System.out.printf("\n  Calendar for %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Print spaces for the first week (indentation)
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println(); // Ensure final newline after the calendar
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        // Display the calendar for the given month and year
        displayCalendar(month, year);
        
        scanner.close();
    }
}