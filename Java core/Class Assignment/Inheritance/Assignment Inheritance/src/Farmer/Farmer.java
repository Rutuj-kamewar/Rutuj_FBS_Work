package Farmer;

// Superclass
class Farmer {
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

    // Getters and setters
    int getFarmerId() { return farmerId; }
    void setFarmerId(int farmerId) { this.farmerId = farmerId; }

    String getFarmerName() { return farmerName; }
    void setFarmerName(String farmerName) { this.farmerName = farmerName; }

    double getLandArea() { return landArea; }
    void setLandArea(double landArea) { this.landArea = landArea; }

    String getCity() { return city; }
    void setCity(String city) { this.city = city; }

    double getAnnualIncome() { return annualIncome; }
    void setAnnualIncome(double annualIncome) { this.annualIncome = annualIncome; }

    int getNoOfEquipment() { return noOfEquipment; }
    void setNoOfEquipment(int noOfEquipment) { this.noOfEquipment = noOfEquipment; }

    // Display
    void display() {
        System.out.println("Farmer Id: " + farmerId);
        System.out.println("Farmer Name: " + farmerName);
        System.out.println("Land Area: " + landArea);
        System.out.println("City: " + city);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("No. of Equipment: " + noOfEquipment);
    }
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

    int getNoOfCattles() { return noOfCattles; }
    void setNoOfCattles(int noOfCattles) { this.noOfCattles = noOfCattles; }

    double getMilkProducedPerDay() { return milkProducedPerDay; }
    void setMilkProducedPerDay(double milkProducedPerDay) { this.milkProducedPerDay = milkProducedPerDay; }

    int getDairyLicenceNo() { return dairyLicenceNo; }
    void setDairyLicenceNo(int dairyLicenceNo) { this.dairyLicenceNo = dairyLicenceNo; }

    // Display
    void display() {
        super.display();
        System.out.println("No. of Cattles: " + noOfCattles);
        System.out.println("Milk Produced Per Day: " + milkProducedPerDay);
        System.out.println("Dairy Licence No.: " + dairyLicenceNo);
        System.out.println("--------------------------------------");
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

    int getNoOfChickens() { return noOfChickens; }
    void setNoOfChickens(int noOfChickens) { this.noOfChickens = noOfChickens; }

    int getNoOfSheds() { return noOfSheds; }
    void setNoOfSheds(int noOfSheds) { this.noOfSheds = noOfSheds; }

    int getEggsProducedPerDay() { return eggsProducedPerDay; }
    void setEggsProducedPerDay(int eggsProducedPerDay) { this.eggsProducedPerDay = eggsProducedPerDay; }

    String getPoultryFarmerContactName() { return poultryFarmerContactName; }
    void setPoultryFarmerContactName(String name) { this.poultryFarmerContactName = name; }

    // Display
    void display() {
        super.display();
        System.out.println("No. Of Chickens: " + noOfChickens);
        System.out.println("No. of Sheds: " + noOfSheds);
        System.out.println("Eggs Produced Per Day: " + eggsProducedPerDay);
        System.out.println("Contact Name: " + poultryFarmerContactName);
        System.out.println("--------------------------------------");
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

    int getOrganicId() { return organicId; }
    void setOrganicId(int organicId) { this.organicId = organicId; }

    String getFertiliserUsed() { return fertiliserUsed; }
    void setFertiliserUsed(String fertiliserUsed) { this.fertiliserUsed = fertiliserUsed; }

    // Display
    void display() {
        super.display();
        System.out.println("Organic ID: " + organicId);
        System.out.println("Fertiliser Used: " + fertiliserUsed);
        System.out.println("--------------------------------------");
    }
}

// Test class with main()
class TestFarmer {
    public static void main(String[] args) {

        Farmer f1 = new Farmer(1, "Shyam", 5.5, "Pune", 250000.0, 3);

        DairyFarmer d1 = new DairyFarmer(2, "Ramesh", 8.0, "Nagpur", 300000.0, 5, 10, 120.5, 98765);

        PoultryFarmer p1 = new PoultryFarmer(3, "Sita", 2.0, "Mumbai", 150000.0, 2, 250, 4, 200, "Sita Poultry");

        OrganicFarmer o1 = new OrganicFarmer(4, "Mohan", 3.0, "Ahmednagar", 180000.0, 1, 555, "Compost");

        f1.display();
        d1.display();
        p1.display();
        o1.display();
    }
}
