import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for the person's age
        int age; // The person's age
        
        // Prompt the user for input
        System.out.print("Enter the person's age: ");
        age = input.nextInt(); // Get the user's input for age

        // Check if the person is eligible to vote (age >= 18)
        if (age >= 18) {
            // If the person is 18 or older, they can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If the person is younger than 18, they cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        // Close the Scanner object 
        input.close();
    }
}
