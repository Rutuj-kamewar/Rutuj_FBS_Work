class Employee {
    int empId;
    String name;
    String designation;
    double salary;

    void setEmployee(int id, String n, String d, double s) {
        empId = id;
        name = n;
        designation = d;
        salary = s;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployee(101, "Rutuj", "Engineer", 55000);
        e.displayEmployee();
    }
}
