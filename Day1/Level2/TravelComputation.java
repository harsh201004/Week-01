import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);

        //traveler's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //  city details
        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = scanner.nextLine();

        // Input distance and time details
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (hours and minutes separated by space): ");
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int timeFromToVia = hours1 * 60 + minutes1;

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
        double distanceViaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (hours and minutes separated by space): ");
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int timeViaToFinalCity = hours2 * 60 + minutes2;

        //total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " +
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " km and " +
                           "the Total Time taken is " + totalTime + " minutes.");

    }
}
