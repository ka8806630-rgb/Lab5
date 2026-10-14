public class HumanResources {
    private Employee emp1;
    private Employee emp2;
    private Employee emp3;

    static void logAction(String action) {
        System.out.println("[LOG]: " + action);
    }

    protected boolean isEmployeeExists(int employeeId) {
        if (emp1 != null && emp1.getId() == employeeId) return true;
        if (emp2 != null && emp2.getId() == employeeId) return true;
        if (emp3 != null && emp3.getId() == employeeId) return true;
        return false;
    }

    public boolean addEmployee(Employee employee) {
        if (employee == null) {
            logAction("Cannot add null employee.");
            return false;
        }

        if (isEmployeeExists(employee.getId())) {
            logAction("Employee ID " + employee.getId() + " already exists!");
            return false;
        }

        if (emp1 == null) {
            emp1 = employee;
            logAction("Employee added to Slot 1.");
            return true;
        } else if (emp2 == null) {
            emp2 = employee;
            logAction("Employee added to Slot 2.");
            return true;
        } else if (emp3 == null) {
            emp3 = employee;
            logAction("Employee added to Slot 3.");
            return true;
        } else {
            logAction("Capacity reached! Cannot add more employees.");
            return false;
        }
    }

    public boolean updateBonus(int employeeId, double bonus) {
        if (emp1 != null && emp1.getId() == employeeId) {
            emp1.setBonus(bonus);
            logAction("Bonus updated for Employee ID " + employeeId);
            return true;
        }
        if (emp2 != null && emp2.getId() == employeeId) {
            emp2.setBonus(bonus);
            logAction("Bonus updated for Employee ID " + employeeId);
            return true;
        }
        if (emp3 != null && emp3.getId() == employeeId) {
            emp3.setBonus(bonus);
            logAction("Bonus updated for Employee ID " + employeeId);
            return true;
        }

        logAction("Employee ID " + employeeId + " not found!");
        return false;
    }

    public void displayAllEmployees() {
        System.out.println("\n--- All Employees ---");
        boolean empty = true;

        if (emp1 != null) {
            System.out.println(emp1);
            empty = false;
        }
        if (emp2 != null) {
            System.out.println(emp2);
            empty = false;
        }
        if (emp3 != null) {
            System.out.println(emp3);
            empty = false;
        }

        if (empty) {
            System.out.println("No employees in the system.");
        }
        System.out.println("---------------------\n");
    }
}