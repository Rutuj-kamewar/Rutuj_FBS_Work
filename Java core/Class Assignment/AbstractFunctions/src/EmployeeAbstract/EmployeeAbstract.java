package EmployeeAbstract;

// Super Class
abstract class Employee {
    String name;
    double salary;
    int id;

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

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setId(int id) {
        this.id = id;
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

    // ABSTRACT METHODS
    abstract double calculateTotalSalary();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
    
}

// Subclass 1 - HR
class Hr extends Employee {
    double commission;

    Hr() {
        super();
        this.commission = 10000;
    }

    Hr(int id, String name, double salary, double commission) {
        super(name, salary, id);
        this.commission = commission;
    }

    void setHr(int id, String name, double salary, double commission) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
    }
    void setCommision(double commission) {
    	this.commission = commission;
    }

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

    double calculateTotalSalary() {
        return salary + salary + commission;
    }

    public String toString() {
        return "HR ID: " + id +
               "\nHR Name: " + name +
               "\nSalary: " + salary +
               "\nCommission: " + commission +
               "\nTotal Salary: " + calculateTotalSalary();
    }
}

// Subclass 2 - Admin
class Admin extends Employee {
    double allowance;

    Admin() {
        super();
        this.allowance = 5000;
    }

    Admin(int id, String name, double salary, double allowance) {
        super(name, salary, id);
        this.allowance = allowance;
    }

    void setAdmin(int id, String name, double salary, double allowance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }

    
    void setAllowance(int Allowance) {
    	this.allowance = Allowance;
    }
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

    double calculateTotalSalary() {
        return salary + salary + allowance;
    }

    public String toString() {
        return "Admin ID: " + id +
               "\nAdmin Name: " + name +
               "\nSalary: " + salary +
               "\nAllowance: " + allowance +
               "\nTotal Salary: " + calculateTotalSalary();
    }
}

class salesManager extends Employee {

    double incentive;
    double target;

    public salesManager() {
        super();
        this.incentive = 0.0;
        this.target = 0.0;
    }

    public salesManager(String name, double salary, int id, double incentive, double target) {
        super(name, salary, id);
        this.incentive = incentive;
        this.target = target;
    }

    public double getIncentive() {
        return incentive;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    double calculateTotalSalary() {
        return salary + salary + incentive;
    }

    public String toString() {
        return "Sales Manager ID: " + id +
               "\nName: " + name +
               "\nSalary: " + salary +
               "\nIncentive: " + incentive +
               "\nTarget: " + target +
               "\nTotal Salary: " + calculateTotalSalary();
    }
}

class areaSalesManager extends salesManager {
    String areaName;

    areaSalesManager() {
        super();
        this.areaName = "Area";
    }

    areaSalesManager(String name, double salary, int id, double incentive, double target, String areaName) {
        super(name, salary, id, incentive, target);
        this.areaName = areaName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String toString() {
        return super.toString() +
               "\nArea Name: " + areaName;
    }
}

class TestEmployee {
    public static void main(String[] args) {

        Employee e1;

        e1 = new Hr(101, "Rutuj", 45000.0, 10000.0);
        System.out.println(e1);

        e1 = new Admin(102, "Rahul", 50000.0, 8000.0);
        System.out.println(e1);

        e1 = new areaSalesManager("Atharv", 25000, 61, 10000, 20000, "Pune");
        System.out.println(e1);
        
        
        
        TestEmployee.giveBonus(new Admin(102, "Rutuj", 500000.0, 8000.0));
        

    }

    static void giveBonus(Employee e1) {
		// TODO Auto-generated method stub
    	if(e1 instanceof Admin) {
    		Admin Ad = (Admin)e1;
    		Ad.setAllowance(5000);
    	}
    	else if(e1 instanceof Hr) {
    		Hr h = (Hr)e1;
    		h.setCommision(5000);
    	}
		
	}
    
    
}
