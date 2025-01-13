import java.util.Scanner;

public class HandshakesM {

    // Method to calculate the number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for number of students
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = calculateHandshakes(number);

        // Output the result
        System.out.println("The maximum number of handshakes among " + number + " students is: " + handshakes);

        input.close();
    }
}
