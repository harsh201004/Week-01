public class SpringSeason {

    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide both month and day.");
            return;
        }

        // Parse the command line arguments into integers
        int month = Integer.parseInt(args[0]); // The month value
        int day = Integer.parseInt(args[1]);   // The day value

        // Check if the given date is within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
