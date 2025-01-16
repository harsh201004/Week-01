import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for age and height of 3 friends
        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;

        // Take user input for ages and heights of the 3 friends
        System.out.print("Enter the age of Amar: ");
        ageAmar = input.nextInt();

        System.out.print("Enter the height of Amar in meters: ");
        heightAmar = input.nextDouble();

        System.out.print("Enter the age of Akbar: ");
        ageAkbar = input.nextInt();

        System.out.print("Enter the height of Akbar in meters: ");
        heightAkbar = input.nextDouble();

        System.out.print("Enter the age of Anthony: ");
        ageAnthony = input.nextInt();

        System.out.print("Enter the height of Anthony in meters: ");
        heightAnthony = input.nextDouble();

        // Find the youngest friend by comparing ages
        int youngestAge = ageAmar;
        String youngestFriend = "Amar";

        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        }

        // Find the tallest friend by comparing heights
        double tallestHeight = heightAmar;
        String tallestFriend = "Amar";

        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        }

        // Display the youngest and the tallest friend
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " meters.");

        // Close the scanner object
        input.close();
    }
}
