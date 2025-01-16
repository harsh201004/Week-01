import java.util.Scanner;

public class VotingEligibility {

    public static String[][] votingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    public static void results(String[][] results) {
        for (String[] row : results) {
            System.out.println(row[0] + " " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
        String[][] results = votingEligibility(ages);
        results(results);
        input.close();
    }
}
