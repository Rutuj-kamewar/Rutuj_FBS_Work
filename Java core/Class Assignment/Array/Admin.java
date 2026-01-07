class Admin {
    int Id;
    String name;
    double salary;

    Admin(){
        this.Id = 01;
        this.name = "Name";
        this.salary = 01;
    }

    void setAdmin(int Id, String name, double salary) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }

    int getAdminId() { return this.Id; }
    String getName() { return this.name; }
    double getSalary() { return this.salary; }

    void displayAdmin() {
        System.out.println("Admin ID: " + this.Id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    
}

class result{
public static void main(String[] args) {
        // create an array of Adminloyees and populate it
        Admin[] arr = new Admin[3];

        arr[0] = new Admin();
        arr[0].setAdmin(101, "Rutuj", 55000);

        arr[1] = new Admin();
        arr[1].setAdmin(102, "Atharv", 75000);

        arr[2] = new Admin();
        arr[2].setAdmin(103, "Sameer", 48000);

        // print all Adminloyees
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1));
            arr[i].displayAdmin();
        }
    }
}

