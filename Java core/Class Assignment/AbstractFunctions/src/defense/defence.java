package defense;

abstract class defence {
    String NameOfHead;
    int noOfTroops;
    int noOfVehicles;
    String countryName;
    int manPowerCount;
    String locationOfHeadQuarter;
    double budget;
    int noOfDepartment;
    int noOfMissionsPerformed;
    int noOfCasualties;

    defence(String nameOfHead, int noOfTroops, int noOfVehicles, String countryName, int manPowerCount,
            String locationOfHeadQuarter, double budget, int noOfDepartment, int noOfMissionsPerformed,
            int noOfCasualties) {

        NameOfHead = nameOfHead;
        this.noOfTroops = noOfTroops;
        this.noOfVehicles = noOfVehicles;
        this.countryName = countryName;
        this.manPowerCount = manPowerCount;
        this.locationOfHeadQuarter = locationOfHeadQuarter;
        this.budget = budget;
        this.noOfDepartment = noOfDepartment;
        this.noOfMissionsPerformed = noOfMissionsPerformed;
        this.noOfCasualties = noOfCasualties;
    }

    // ABSTRACT toString()
    public abstract String toString();
}

class army extends defence {

    int noOfTanks;
    int noOfGuns;
    int noOfGrenade;
    int noOfBatallion;

    public army(String nameOfHead, int noOfTroops, int noOfVehicles, String countryName, int manPowerCount,
            String locationOfHeadQuarter, double budget, int noOfDepartment, int noOfMissionsPerformed,
            int noOfCasualties, int noOfTanks, int noOfGuns, int noOfGrenade, int noOfBatallion) {

        super(nameOfHead, noOfTroops, noOfVehicles, countryName, manPowerCount, locationOfHeadQuarter, budget,
                noOfDepartment, noOfMissionsPerformed, noOfCasualties);

        this.noOfTanks = noOfTanks;
        this.noOfGuns = noOfGuns;
        this.noOfGrenade = noOfGrenade;
        this.noOfBatallion = noOfBatallion;
    }

    public String toString() {
        return  "Name of Head: " + NameOfHead +
                "\nNO. of Troops: " + noOfTroops +
                "\nno. of Vehicles: " + noOfVehicles +
                "\nCountry Name: " + countryName +
                "\nman Power count : " + manPowerCount +
                "\nlacation of Head Quarter: " + locationOfHeadQuarter +
                "\nbudget: " + budget +
                "\nno. Of Departments: " + noOfDepartment +
                "\nNo. of Missions Performed: " + noOfMissionsPerformed +
                "\nno. of Casualties: " + noOfCasualties +
                "\n\nNo.of Tanks: " + noOfTanks +
                "\nNo. of Guns: " + noOfGuns +
                "\nNo. of Grenade: " + noOfGrenade +
                "\nNO. of Battalions: " + noOfBatallion;
    }
}

class Navy extends defence {

    int noOfShips;
    int noOfSubmarines;
    int noOftorpedies;

    public Navy(String nameOfHead, int noOfTroops, int noOfVehicles, String countryName, int manPowerCount,
            String locationOfHeadQuarter, double budget, int noOfDepartment, int noOfMissionsPerformed,
            int noOfCasualties, int noOfShips, int noOfSubmarines, int noOftorpedies) {

        super(nameOfHead, noOfTroops, noOfVehicles, countryName, manPowerCount, locationOfHeadQuarter, budget,
                noOfDepartment, noOfMissionsPerformed, noOfCasualties);

        this.noOfShips = noOfShips;
        this.noOfSubmarines = noOfSubmarines;
        this.noOftorpedies = noOftorpedies;
    }

    public String toString() {
        return  "Name of Head: " + NameOfHead +
                "\nNO. of Troops: " + noOfTroops +
                "\nno. of Vehicles: " + noOfVehicles +
                "\nCountry Name: " + countryName +
                "\nman Power count : " + manPowerCount +
                "\nlacation of Head Quarter: " + locationOfHeadQuarter +
                "\nbudget: " + budget +
                "\nno. Of Departments: " + noOfDepartment +
                "\nNo. of Missions Performed: " + noOfMissionsPerformed +
                "\nno. of Casualties: " + noOfCasualties +
                "\n\nNo.of Ships: " + noOfShips +
                "\nNo. of Submarines: " + noOfSubmarines +
                "\nNo. of Torpedoes: " + noOftorpedies;
    }
}

class TestDefence {

    public static void main(String[] args) {
    	
    	defence d1;

        d1 = new army("Rutuj", 15000, 16000, "India", 10000,
                "Pune", 5550.05, 10, 5, 5000, 10, 15, 100, 10);
        System.out.println(d1);

        d1 = new Navy("Rutuj", 15000, 16000, "India", 10000,
                "Pune", 5550.05, 10, 5, 5000, 150, 13, 12);
        System.out.println(d1);
    }
}
