import java.util.Scanner;

public class HandshakesN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes using the formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

        input.close();
    }
}
