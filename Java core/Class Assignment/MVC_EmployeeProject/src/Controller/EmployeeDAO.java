package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Model.*;

public class EmployeeDAO {

    private List<Employee> employeeList = new ArrayList<>();

    // *************************************************
    //   HARD-CODED EMPLOYEES LOADED AT STARTUP
    // *************************************************
    public void hardCodedEmployee() {

        Employee e1 = new Admin(101, "Rohit", 30000, 5000);
        Employee e2 = new HR(102, "Sneha", 28000, 3000);
        Employee e3 = new SalesManager(103, "Amit", 35000, 20, 8000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
    }

    // ADD EMPLOYEE
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    // CHECK IF ID EXISTS
    public boolean idExists(int id) {
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // SEARCH EMPLOYEE BY ID
    public Employee searchEmployee(int id) {
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    // DELETE EMPLOYEE
    public boolean deleteEmployee(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(i);
                return true;
            }
        }
        return false;
    }

    // GET ALL EMPLOYEES
    public List<Employee> getAll() {
        return employeeList;
    }

    // SORT BY ID (NO LAMBDA)
    public void sortById() {
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                return a.getId() - b.getId();
            }
        });
    }

    // SORT BY NAME (NO LAMBDA)
    public void sortByName() {
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                return a.getName().compareToIgnoreCase(b.getName());
            }
        });
    }

    // SORT BY SALARY (NO LAMBDA)
    public void sortBySalary() {
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                if (a.getSalary() > b.getSalary())
                    return 1;
                else if (a.getSalary() < b.getSalary())
                    return -1;
                else
                    return 0;
            }
        });
    }
}
