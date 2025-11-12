package Defence;

/**
 * 
 */
class Defence {
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

	// Constructor
	Defence(String nameOfHead, int noOfTroops, int noOfVehicles, String countryName, int manPowerCount,
			String locationOfHeadQuarter, double budget, int noOfDepartment, int noOfMissionsPerformed,
			int noOfCasualties) {
		super();
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

	// Setters and Getters
	String getNameOfHead() {
		return NameOfHead;
	}

	void setNameOfHead(String nameOfHead) {
		NameOfHead = nameOfHead;
	}

	int getNoOfTroops() {
		return noOfTroops;
	}

	void setNoOfTroops(int noOfTroops) {
		this.noOfTroops = noOfTroops;
	}

	int getNoOfVehicles() {
		return noOfVehicles;
	}

	void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}

	String getCountryName() {
		return countryName;
	}

	void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	int getManPowerCount() {
		return manPowerCount;
	}

	void setManPowerCount(int manPowerCount) {
		this.manPowerCount = manPowerCount;
	}

	String getLocationOfHeadQuarter() {
		return locationOfHeadQuarter;
	}

	void setLocationOfHeadQuarter(String locationOfHeadQuarter) {
		this.locationOfHeadQuarter = locationOfHeadQuarter;
	}

	double getBudget() {
		return budget;
	}

	void setBudget(double budget) {
		this.budget = budget;
	}

	int getNoOfDepartment() {
		return noOfDepartment;
	}

	void setNoOfDepartment(int noOfDepartment) {
		this.noOfDepartment = noOfDepartment;
	}

	int getNoOfMissionsPerformed() {
		return noOfMissionsPerformed;
	}

	void setNoOfMissionsPerformed(int noOfMissionsPerformed) {
		this.noOfMissionsPerformed = noOfMissionsPerformed;
	}

	int getNoOfCasualties() {
		return noOfCasualties;
	}

	void setNoOfCasualties(int noOfCasualties) {
		this.noOfCasualties = noOfCasualties;
	}

	// Display
	void display() {
		System.out.println("Name of Head: " + NameOfHead);
		System.out.println("NO. of Troops: " + noOfTroops);
		System.out.println("no. of Vehicles: " + noOfVehicles);
		System.out.println("Country Name: " + countryName);
		System.out.println("man Power coount : " + manPowerCount);
		System.out.println("lacation of Head Quarter: " + locationOfHeadQuarter);
		System.out.println("budget: " + budget);
		System.out.println("no. Of Departments: " + noOfDepartment);
		System.out.println("No. of Missions Performed: " + noOfMissionsPerformed);
		System.out.println("no. of Casualties: " + noOfCasualties);
		

	}
}

class army extends Defence {

	int noOfTanks;
	int noOfGuns;
	int noOfGrenade;
	int noOfBatallion;

	// Constructor
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

	// Setters and Getters
	public int getNoOfTanks() {
		return noOfTanks;
	}

	public void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}

	public int getNoOfGuns() {
		return noOfGuns;
	}

	public void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}

	public int getNoOfGrenade() {
		return noOfGrenade;
	}

	public void setNoOfGrenade(int noOfGrenade) {
		this.noOfGrenade = noOfGrenade;
	}

	public int getNoOfBatallion() {
		return noOfBatallion;
	}

	public void setNoOfBatallion(int noOfBatallion) {
		this.noOfBatallion = noOfBatallion;
	}
	
	//Display
	
	void display() {
		super.display();
		System.out.println("\n\n");
		System.out.println("No.of tanks: "+noOfTanks);
		System.out.println("No. of Guns: "+ noOfTanks);
		System.out.println("No. of Grenade: "+ noOfGrenade);
		System.out.println("NO. of Bttalions: "+ noOfBatallion);
	}
}

class Navy extends Defence{
	
	int noOfShips;
	int noOfSubmarines;
	int noOftorpedies;
	
	//Constructor
	public Navy(String nameOfHead, int noOfTroops, int noOfVehicles, String countryName, int manPowerCount,
			String locationOfHeadQuarter, double budget, int noOfDepartment, int noOfMissionsPerformed,
			int noOfCasualties, int noOfShips, int noOfSubmarines, int noOftorpedies) {
		super(nameOfHead, noOfTroops, noOfVehicles, countryName, manPowerCount, locationOfHeadQuarter, budget,
				noOfDepartment, noOfMissionsPerformed, noOfCasualties);
		this.noOfShips = noOfShips;
		this.noOfSubmarines = noOfSubmarines;
		this.noOftorpedies = noOftorpedies;
	}

	
	//Setters and Getters
	public int getNoOfShips() {
		return noOfShips;
	}

	public void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}

	public int getNoOfSubmarines() {
		return noOfSubmarines;
	}

	public void setNoOfSubmarines(int noOfSubmarines) {
		this.noOfSubmarines = noOfSubmarines;
	}

	public int getNoOftorpedies() {
		return noOftorpedies;
	}

	public void setNoOftorpedies(int noOftorpedies) {
		this.noOftorpedies = noOftorpedies;
	}
	
	//Display
	void display() {
		super.display();
		System.out.println("\n\n");
		System.out.println("No.of Ships: "+noOfShips);
		System.out.println("No. of Submarines: "+noOfSubmarines);
		System.out.println("No. of Torpedies: "+ noOftorpedies);
	}	
}

class TestDefence{
	
	public static void main(String[]args) {
		
		Defence D1 = new Defence("Rutuj",15000,16000,"India",10000,"Pune",5550.05,10,5,5000);
		army A1 = new army("Rutuj",15000,16000,"India",10000,"Pune",5550.05,10,5,5000,10,15,100,10);
		Navy N1 = new Navy("Rutuj",15000,16000,"India",10000,"Pune",5550.05,10,5,5000,150,13,12);
		
		D1.display();
		A1.display();
		N1.display();
	}
}
