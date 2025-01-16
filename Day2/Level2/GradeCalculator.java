import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the marks in three subjects and total marks
        double physics, chemistry, maths, totalMarks, percentage, average;

        // Prompt the user to input marks for each subject
        System.out.print("Enter marks for Physics: ");
        physics = input.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        chemistry = input.nextDouble();

        System.out.print("Enter marks for Maths: ");
        maths = input.nextDouble();

        // Calculate total marks and percentage
        totalMarks = physics + chemistry + maths;
        average = totalMarks / 3;
        percentage = (totalMarks / 300) * 100;

        // Output the average marks and percentage
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade and remarks based on the percentage
        String grade=" ";
        String remarks=" ";

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70 && percentage<=79) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60 && percentage<=69) {
            grade = "C";
            remarks = "Level 2, Below, but approaching agency-normalized standards";
        } else if (percentage >= 50 && percentage<=59) {
            grade = "D";
            remarks = "Level 1, well below gency-normalized standards";
        } else if (percentage >= 40 && percentage<=49) {
            grade = "E";
            remarks = "Level 1, Too below agency-normalized standards";
        } else if(percentage <= 39){
            grade = "R";
            remarks = "remedial standards";
        }

        // Output the grade and remarks
        System.out.println("\nGrade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the Scanner object
        input.close();
    }
}
