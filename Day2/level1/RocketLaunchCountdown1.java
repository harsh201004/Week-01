import java.util.Scanner;

public class RocketLaunchCountdown1 {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Declare the counter variable
        int counter; // The starting value for the countdown
        
        // Prompt the user for the starting number for the countdown
        System.out.print("Enter the countdown starting number: ");
        counter = input.nextInt(); // Get the user's input for the countdown starting value

        // Countdown using a for loop
        for (int i = counter; i > 0; i--) {
            System.out.println("T-minus " + i + " seconds");
        }

        // Print the final message after the countdown reaches zero
        System.out.println("Liftoff! Rocket launched!");
        
        // Close the Scanner object 
        input.close();
    }
}
