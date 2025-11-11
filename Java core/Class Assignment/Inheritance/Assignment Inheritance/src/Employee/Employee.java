package Employee;

// Super Class
class Employee {
    String name;
    double salary;
    int id;
    static double companyBonusRate = 10.0;

    // Default constructor
    Employee() {
        this.name = "Unknown";
        this.salary = 0.0;
        this.id = 0;
    }

    // Parameterized constructor
    Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    // Setters
    static void setCompanyBonusRate(double rate) {
        companyBonusRate = rate;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setId(int id) {
        this.id = id;
    }

    // Getters
    static double getCompanyBonusRate() {
        return companyBonusRate;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    double getSalary() {
        return this.salary;
    }

    // Function
    double calculateTotalSalary() {
        return salary + (salary * companyBonusRate / 100);
    }

    // Display details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus Rate: " + companyBonusRate + "%");
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("--------------------------------------");
    }
}

// Subclass 1 - HR
class Hr extends Employee {
    double commission;

    // Default constructor
    Hr() {
        super();
        this.commission = 10000;
    }

    // Parameterized constructor
    Hr(int id, String name, double salary, double commission) {
        super(name, salary, id);
        this.commission = commission;
    }

    // Setters
    void setHr(int id, String name, double salary, double commission) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
    }

    // Getters
    int getHrId() {
        return this.id;
    }

    String getHrName() {
        return this.name;
    }

    double getHrSalary() {
        return this.salary;
    }

    double getCommission() {
        return this.commission;
    }

    // Display HR details
    void display() {
        System.out.println("HR ID: " + this.id);
        System.out.println("HR Name: " + this.name);
        System.out.println("HR Salary: " + this.salary);
        System.out.println("Commission: " + this.commission);
        System.out.println("Total Salary" + calculateTotalSalary());
    }
}

// Subclass 2 - Admin
class Admin extends Employee {
    double allowance;

    // Default constructor
    Admin() {
        super();
        this.allowance = 5000;
    }

    // Parameterized constructor
    Admin(int id, String name, double salary, double allowance) {
        super(name, salary, id);
        this.allowance = allowance;
    }

    // Setter method
    void setAdmin(int id, String name, double salary, double allowance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }

    // Getter methods
    int getAdminId() {
        return this.id;
    }

    String getAdminName() {
        return this.name;
    }

    double getAdminSalary() {
        return this.salary;
    }

    double getAllowance() {
        return this.allowance;
    }

    // Display Admin details
    void display() {
        System.out.println("Admin ID: " + this.id);
        System.out.println("Admin Name: " + this.name);
        System.out.println("Admin Salary: " + this.salary);
        System.out.println("Allowance: " + this.allowance);
        System.out.println("Total Salary " + calculateTotalSalary());
    }
}
class TestEmployee {
    public static void main(String[] args) {

        Hr hr1 = new Hr(101, "Priya", 45000.0, 10000.0);

        Admin ad1 = new Admin(102, "Rahul", 50000.0, 8000.0);

        hr1.display();
        ad1.display();
    }
}
