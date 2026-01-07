class Hr {
   int Id;
   String name;
   double salary;
   double commission;

   Hr() {
    this.Id = 1;
    this.name = "Rutuj";
    this.salary = 25000;
    this.commission = 10000;
   }

   void setHr(int var1, String var2, double var3,double var4) {
      this.Id = var1;
      this.name = var2;
      this.salary = var3;
      this.commission = var4;
   }

   int getHrId() {
      return this.Id;
   }

   String getName() {
      return this.name;
   }

   double getSalary() {
      return this.salary;
   }
   double getCommision() {
      return this.commission;
   }
   

   void displayHr() {
      System.out.println("Hr ID: " + this.Id);
      System.out.println("Name: " + this.name);
      System.out.println("Salary: " + this.salary);
   }
}

class result{
public static void main(String[] args) {
        // create an array of Hrloyees and populate it
        Hr[] arr = new Hr[3];

        arr[0] = new Hr();
        arr[0].setHr(101, "Rutuj", 55000,10000);

        arr[1] = new Hr();
        arr[1].setHr(102, "Atharv", 75000,10000);

        arr[2] = new Hr();
        arr[2].setHr(103, "Sameer", 48000,10000);

        // print all Hrloyees
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1));
            arr[i].displayHr();
        }
    }
}

