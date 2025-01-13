import java.util.Scanner;

public class BonusOfEmployees {

    public static void main(String[] args) {

        double[] oldSalary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            
            
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                oldSalary[i] = input.nextDouble();

                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextDouble();

                if (oldSalary[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.print("Invalid input. Please enter positive values.");
                    
				for(int j = 0 ; j<=1; j++){
						 System.out.print("Enter salary of employee " + (i + 1) + ": ");
                oldSalary[i] = input.nextDouble();

                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextDouble();
				}
					
                if (oldSalary[i] <= 0 || yearsOfService[i] < 0) {
                        System.out.println("Maximum attempts reached for employee " + (i + 1) + ". Skipping...");
                        oldSalary[i] = 0;
                        yearsOfService[i] = 0;
                        break;
                    }
                }
        }

        for (int i = 0; i < 2; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05; 
            } else {
                bonus[i] = oldSalary[i] * 0.02; 
            }

            newSalary[i] = oldSalary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalary[i];
        }

        // Print total bonus, old salary, and new salary of employees
        System.out.println("\nSummary:");
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total new salary of all employees: " + totalNewSalary);

    }
}
