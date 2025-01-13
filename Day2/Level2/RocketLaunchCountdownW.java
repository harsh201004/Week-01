import java.util.Scanner;
public class RocketLaunchCountdownW {
    public static void main(String harsh) {
        // user input
        Scanner scanner = new Scanner(System.in);

        // enter the starting value for the countdown
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();

        // While loop to countdown from the input value to 1
        while (counter >= 1) {
            System.out.println("T-minus " + counter + " seconds");
            counter--;  // Decrement the counter
        }
        // Print the launch message
        System.out.println("Rocket launch!");
    }
}