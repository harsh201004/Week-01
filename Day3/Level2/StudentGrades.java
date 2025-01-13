import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Arrays to store marks, percentages, and grades
        int[][] marks = new int[numStudents][3]; // [Physics, Chemistry, Maths]
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input marks for Physics
            do {
                System.out.print("Physics: ");
                marks[i][0] = input.nextInt();
                if (marks[i][0] < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (marks[i][0] < 0);

            // Input marks for Chemistry
            do {
                System.out.print("Chemistry: ");
                marks[i][1] = input.nextInt();
                if (marks[i][1] < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (marks[i][1] < 0);

            // Input marks for Maths
            do {
                System.out.print("Maths: ");
                marks[i][2] = input.nextInt();
                if (marks[i][2] < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (marks[i][2] < 0);

            // Calculate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;

            // Determine grade
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        // Display results without formatting
        
        for (int i = 0; i < numStudents; i++) {
		System.out.println("\nDetails of student :" + (i+1));
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] + " marks");
            System.out.println("Chemistry: " + marks[i][1] + " marks");
            System.out.println("Maths: " + marks[i][2] + " marks");
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println(); // Adds a blank line between students
        }

        input.close();
    }
}
