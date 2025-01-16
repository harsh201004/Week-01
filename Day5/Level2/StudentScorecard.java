import java.util.Scanner;

public class StudentScorecard {

    // Method to take input for student scores
    public static int[][] inputScores(int numberOfStudents) {
        Scanner input = new Scanner(System.in);
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Physics ");
            scores[i][0] = input.nextInt();
            System.out.print("Chemistry ");
            scores[i][1] = input.nextInt();
            System.out.print("Maths ");
            scores[i][2] = input.nextInt();
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateScores(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100) / 100.0;
            results[i][2] = Math.round(percentage * 100) / 100.0;
        }
        return results;
    }

    // Method to calculate grades based on percentage
    public static char[] calculateGrades(double[][] results) {
        int numberOfStudents = results.length;
        char[] grades = new char[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 70) {
                grades[i] = 'B';
            } else if (percentage >= 60) {
                grades[i] = 'C';
            } else if (percentage >= 50) {
                grades[i] = 'D';
            } else if (percentage >= 50) {
                grades[i] = 'E';
			}
			else {
                grades[i] = 'R';
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        for (int i = 0; i < scores.length; i++) {
			System.out.println("\n");
            System.out.println("Student " + (i + 1));
            System.out.println("Physics " + scores[i][0]);
            System.out.println("Chemistry " + scores[i][1]);
            System.out.println("Maths " + scores[i][2]);
            System.out.println("Total " + (int) results[i][0]);
            System.out.println("Average " + results[i][1]);
            System.out.println("Percentage " + results[i][2]);
            System.out.println("Grade " + grades[i]);
			System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();

        int[][] scores = inputScores(numberOfStudents);
        double[][] results = calculateScores(scores);
        char[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);

        input.close();
    }
}
