import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HumanResources hr = new HumanResources();
        boolean running = true;

        while (running) {
            System.out.println("=== Employee Management System (Lab 5) ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Bonus");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());

                    Employee emp = new Employee(id, name, salary);
                    hr.addEmployee(emp);
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Bonus Amount: ");
                    double bonus = Double.parseDouble(scanner.nextLine());

                    hr.updateBonus(updateId, bonus);
                    break;

                case 3:
                    hr.displayAllEmployees();
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }

        scanner.close();
    }
}