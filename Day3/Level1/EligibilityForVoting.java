import java.util.Scanner;

public class EligibilityForVoting {

    public static void main(String[] args) {
		
		//Create an array of size 10
        int[] ages = new int[10];
        Scanner input = new Scanner(System.in);

        // Input ages for 10 students
        for (int i = 0; i < ages.length; i++) {
		
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
			
            // Check for negative age
            
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
			int age = ages[i];
            if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else if(age < 18 && age >= 0) {
                System.out.println("The student with the age " + age + " cannot vote.");
            }else {
				System.out.println("Invalid age.");
			}
        }
    }
}