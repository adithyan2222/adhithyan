import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        double totalSalary = hoursWorked * hourlyRate;
        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Total Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + totalSalary);
        scanner.close();
    }
}
