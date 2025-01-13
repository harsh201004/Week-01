public class SpringSeasonM {

    // Method to check 
    public static boolean isSpringSeason(int month, int day) {
	
        // Spring season starts on March 20 and ends on June 20
        if (month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)) {
            return true; // It's Spring Season
        }
        return false; 
    }

    public static void main(String[] args) {
        // Ensure that there are exactly two command-line arguments for month and day
        if (args.length != 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }

        // Parse the month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the month and day are within valid ranges
        if (month < 1 || month > 12 || day < 1 || day > 31) 
		{
            System.out.println("Invalid month or day entered.");
            return;
        }

        // Call the method to check for Spring season
        if (isSpringSeason(month, day))
		{
            System.out.println("It's a Spring Season.");
        }
		else{
            System.out.println("Not a Spring Season.");
        }
    }
}
