import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Take user input for month, day, and year
        System.out.print("Enter the month (1-12): ");
        int m = input.nextInt();
        System.out.print("Enter the day (1-31): ");
        int d = input.nextInt();
        System.out.print("Enter the year (e.g., 2022): ");
        int y = input.nextInt();

        // Implement the Zeller's congruence algorithm

        // Step 1: Adjust year and month values
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 2: Calculate the day of the week (d0)
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Step 3: Output the result (0 for Sunday, 1 for Monday, etc.)
        System.out.println("The day of the week is: " + d0);

        // Close the scanner object
        input.close();
    }
}
