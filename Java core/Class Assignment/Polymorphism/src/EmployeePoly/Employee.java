package EmployeePoly;

// Super Class
class Employee {
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

    // Setters

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
        return salary + (salary );
    }

    // Display details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
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
    
    double calculateTotalSalary() {
		return salary + (salary )+commission;
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
    
    double calculateTotalSalary() {
        return salary + (salary)+allowance;
    }
}//Admin class ends here

class salesManager extends Employee {

	
	double incentive;
	double target;
	
	
	//Constructors
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

	//Setters and getters
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
	
	 void display() {
	        super.display();
	        System.out.println("Incentive: " + incentive);
	        System.out.println("target: " + target);

	    }	
	 
	 double calculateTotalSalary() {
			return salary + (salary )+incentive;
	    }
	 
		
}//Sales Manager class ends here

class areaSalesManager extends salesManager{
	String areaName;
	
	//constructor Default 
	areaSalesManager(){
		super();
		this.areaName = "Area";
	}
	//Parametric Constructor
	areaSalesManager(String name, double salary, int id, double incentive, double target,String areaName){
		super(name,salary,id,incentive,target);
		this.areaName = areaName;
	}
	
	//Getters and Setters
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	//Display Function
	void display() {
		super.display();
		System.out.println("Area Name: "+areaName);
	}	
}//Area Sales Manager ends here.

class TestEmployee {
    public static void main(String[] args) {																
    	
    	
    	Employee e1;
    	e1 = new Employee("Rutuj", 45000.0,59);
    	e1.display();
    	
    	e1 = new Hr(101, "Rutuj", 45000.0, 10000.0);
    	e1.display();
    	
    	e1 = new Admin(102, "Rahul", 50000.0, 8000.0);
    	e1.display();
    	
    	e1 = new areaSalesManager("atharv",25000,61,10000,20000,"Pune");
    	e1.display();

    }
}
