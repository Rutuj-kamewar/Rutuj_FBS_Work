package Controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Model.*;

public class EmployeeController {

    private Scanner sc = new Scanner(System.in);
    private EmployeeDAO dao = new EmployeeDAO();

    // MENU HANDLER
    public void handleChoice(int choice) {

        try {
            switch (choice) {

            case 1:
                addEmployee();
                break;

            case 2:
                searchEmployee();
                break;

            case 3:
                updateEmployee();
                break;

            case 4:
                deleteEmployee();
                break;

            case 5:
                displayAllEmployees();
                break;

            case 6:
                sortById();
                break;

            case 7:
                sortByName();
                break;

            case 8:
                sortBySalary();
                break;

            case 0:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type!");
            sc.nextLine();
        }
    }

    // ADD EMPLOYEE
    private void addEmployee() {

        System.out.println("Select Employee Type:");
        System.out.println("1. Admin");
        System.out.println("2. HR");
        System.out.println("3. Sales Manager");

        int type = sc.nextInt();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (dao.idExists(id)) {
            System.out.println("ID already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = null;

        switch (type) {

        case 1:
            System.out.print("Enter Allowance: ");
            double allowance = sc.nextDouble();
            emp = new Admin(id, name, salary, allowance);
            break;

        case 2:
            System.out.print("Enter Commission: ");
            double commission = sc.nextDouble();
            emp = new HR(id, name, salary, commission);
            break;

        case 3:
            System.out.print("Enter Target: ");
            int target = sc.nextInt();
            System.out.print("Enter Incentive: ");
            double incentive = sc.nextDouble();
            emp = new SalesManager(id, name, salary, target, incentive);
            break;

        default:
            System.out.println("Invalid employee type!");
            return;
        }

        dao.addEmployee(emp);
        System.out.println("Employee Added Successfully!");
    }

    // SEARCH EMPLOYEE
    private void searchEmployee() {

        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        Employee emp = dao.searchEmployee(id);

        if (emp == null)
            System.out.println("Employee not found!");
        else
            System.out.println(emp);
    }

    // UPDATE EMPLOYEE
    private void updateEmployee() {

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        Employee emp = dao.searchEmployee(id);

        if (emp == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.print("Enter new Name: ");
        emp.setName(sc.next());

        System.out.print("Enter new Salary: ");
        emp.setSalary(sc.nextDouble());

        if (emp instanceof Admin) {
            Admin a = (Admin) emp;
            System.out.print("Enter new Allowance: ");
            a.setAllowance(sc.nextDouble());
        } 
        else if (emp instanceof HR) {
            HR h = (HR) emp;
            System.out.print("Enter new Commission: ");
            h.setCommission(sc.nextDouble());
        } 
        else if (emp instanceof SalesManager) {
            SalesManager s = (SalesManager) emp;
            System.out.print("Enter new Target: ");
            s.setTarget(sc.nextInt());
            System.out.print("Enter new Incentive: ");
            s.setIncentive(sc.nextDouble());
        }

        System.out.println("Employee Updated!");
    }

    // DELETE EMPLOYEE
    private void deleteEmployee() {

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        if (dao.deleteEmployee(id))
            System.out.println("Employee Deleted!");
        else
            System.out.println("Employee not found!");
    }

    // DISPLAY ALL EMPLOYEES
    private void displayAllEmployees() {

        List<Employee> list = dao.getAll();

        if (list.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }

        for (Employee e : list) {
            System.out.println("-------------------");
            System.out.println(e);
            System.out.println("Calculated Salary: " + e.calculateSalary());
        }
    }

    // SORTING METHODS
    private void sortById() {
        dao.sortById();
        System.out.println("Sorted by ID!");
    }

    private void sortByName() {
        dao.sortByName();
        System.out.println("Sorted by Name!");
    }

    private void sortBySalary() {
        dao.sortBySalary();
        System.out.println("Sorted by Salary!");
    }
}
