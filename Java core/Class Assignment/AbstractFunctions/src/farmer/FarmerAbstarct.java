package farmer;

// Superclass
abstract class Farmer {
    int farmerId;
    String farmerName;
    double landArea;
    String city;
    double annualIncome;
    int noOfEquipment;

    // Default constructor
    Farmer() {
        this.farmerId = 0;
        this.farmerName = "Unknown";
        this.landArea = 0.0;
        this.city = "Unknown";
        this.annualIncome = 0.0;
        this.noOfEquipment = 0;
    }

    // Parameterized constructor
    Farmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, int noOfEquipment) {
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.landArea = landArea;
        this.city = city;
        this.annualIncome = annualIncome;
        this.noOfEquipment = noOfEquipment;
    }

    // Abstract toString()
    public abstract String toString();
}

// Dairy farmer subclass
class DairyFarmer extends Farmer {
    int noOfCattles;
    double milkProducedPerDay;
    int dairyLicenceNo;

    DairyFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, int noOfEquipment,
                int noOfCattles, double milkProducedPerDay, int dairyLicenceNo) {

        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment);

        this.noOfCattles = noOfCattles;
        this.milkProducedPerDay = milkProducedPerDay;
        this.dairyLicenceNo = dairyLicenceNo;
    }

    public String toString() {
        return "Farmer Type: Dairy Farmer" +
               "\nFarmer Id: " + farmerId +
               "\nFarmer Name: " + farmerName +
               "\nLand Area: " + landArea +
               "\nCity: " + city +
               "\nAnnual Income: " + annualIncome +
               "\nNo. of Equipment: " + noOfEquipment +
               "\nNo. of Cattles: " + noOfCattles +
               "\nMilk Produced Per Day: " + milkProducedPerDay +
               "\nDairy Licence No.: " + dairyLicenceNo;
    }
}

// Poultry farmer subclass
class PoultryFarmer extends Farmer {
    int noOfChickens;
    int noOfSheds;
    int eggsProducedPerDay;
    String poultryFarmerContactName;

    PoultryFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, int noOfEquipment,
                  int noOfChickens, int noOfSheds, int eggsProducedPerDay, String poultryFarmerContactName) {

        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment);

        this.noOfChickens = noOfChickens;
        this.noOfSheds = noOfSheds;
        this.eggsProducedPerDay = eggsProducedPerDay;
        this.poultryFarmerContactName = poultryFarmerContactName;
    }

    public String toString() {
        return "Farmer Type: Poultry Farmer" +
               "\nFarmer Id: " + farmerId +
               "\nFarmer Name: " + farmerName +
               "\nLand Area: " + landArea +
               "\nCity: " + city +
               "\nAnnual Income: " + annualIncome +
               "\nNo. of Equipment: " + noOfEquipment +
               "\nNo. Of Chickens: " + noOfChickens +
               "\nNo. of Sheds: " + noOfSheds +
               "\nEggs Produced Per Day: " + eggsProducedPerDay +
               "\nContact Name: " + poultryFarmerContactName;
    }
}

// Organic farmer subclass
class OrganicFarmer extends Farmer {
    int organicId;
    String fertiliserUsed;

    OrganicFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, int noOfEquipment,
                  int organicId, String fertiliserUsed) {

        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment);

        this.organicId = organicId;
        this.fertiliserUsed = fertiliserUsed;
    }

    public String toString() {
        return "Farmer Type: Organic Farmer" +
               "\nFarmer Id: " + farmerId +
               "\nFarmer Name: " + farmerName +
               "\nLand Area: " + landArea +
               "\nCity: " + city +
               "\nAnnual Income: " + annualIncome +
               "\nNo. of Equipment: " + noOfEquipment +
               "\nOrganic ID: " + organicId +
               "\nFertiliser Used: " + fertiliserUsed;
    }
}

// Test class with main()
class TestFarmer {
    public static void main(String[] args) {

        Farmer f1 = new DairyFarmer(1, "Shyam", 5.5, "Pune", 250000.0, 3, 8, 120.5, 12345);
        Farmer d1 = new DairyFarmer(2, "Ramesh", 8.0, "Nagpur", 300000.0, 5, 10, 120.5, 98765);
        Farmer p1 = new PoultryFarmer(3, "Sita", 2.0, "Mumbai", 150000.0, 2, 250, 4, 200, "Sita Poultry");
        Farmer o1 = new OrganicFarmer(4, "Mohan", 3.0, "Ahmednagar", 180000.0, 1, 555, "Compost");

        System.out.println(f1);
        System.out.println("\n--------------------------------------\n");
        System.out.println(d1);
        System.out.println("\n--------------------------------------\n");
        System.out.println(p1);
        System.out.println("\n--------------------------------------\n");
        System.out.println(o1);
    }
}
