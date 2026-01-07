class Employee {
    int empId;
    String name;
    String designation;
    double salary;

    Employee(){
        this.empId = 01;
        this.name = "Name";
        this.designation = "Employee";
        this.salary = 01;
    }

    void setEmployee(int empId, String name, String designation, double salary) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    int getEmpId() { return this.empId; }
    String getName() { return this.name; }
    String getDesignation() { return this.designation; }
    double getSalary() { return this.salary; }

    void displayEmployee() {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Name: " + this.name);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }

    
}

class result{
public static void main(String[] args) {
        // create an array of Employees and populate it
        Employee[] arr = new Employee[3];

        arr[0] = new Employee();
        arr[0].setEmployee(101, "Rutuj", "Engineer", 55000);

        arr[1] = new Employee();
        arr[1].setEmployee(102, "Atharv", "Plumber", 75000);

        arr[2] = new Employee();
        arr[2].setEmployee(103, "Sameer", "Analyst", 48000);

        // print all employees
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1));
            arr[i].displayEmployee();
        }
    }
}
