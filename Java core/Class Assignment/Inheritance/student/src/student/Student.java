package student;


public class Student {

	int fbsId;
	String name;
	double Distance;
	static int count = 0;

	// Constructors
	Student(int fbsId, String name, double distance) {

		this.fbsId = fbsId;
		this.name = name;
		Distance = distance;
		count++;
	}

	Student() {
		this.fbsId = 00;
		this.name = "UnKnown";
		Distance = 0.0;
		count++;
	}

	// Setters and getters
	double getDistance() {
		return Distance;
	}

	int getFbsId() {
		return fbsId;
	}

	void setFbsId(int fbsId) {
		this.fbsId = fbsId;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void setDistance(double distance) {
		Distance = distance;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Student.count = count;
	}

	// Display
	void display() {
		System.out.println("FBSID is: " + this.fbsId);
		System.out.println("Name is: " + this.name);
		System.out.println("Distance is: " + this.Distance);
	}

}//students class ends here

class PlacedStudent extends Student {

	
	String designation;
	String companyName;

	// Constructor
	PlacedStudent(int fbsId, String name, double distance, String designation, String companyName) {
		super(fbsId,name,distance);
		this.designation = designation;
		this.companyName = companyName;
	}

	PlacedStudent() {
		super();
		this.designation = "not Given";
		this.companyName = "UnKnown";
	}

	// Setters and Getters
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	// Display
	void dispaly() {
		super.display();
		System.out.println("Designation is " + this.designation);
		System.out.println("Company Name is " + this.companyName);
	}

}//Placed Students class ends here

class TestStudent{
	
	public static void main(String[] a) {
	PlacedStudent ps1 = new PlacedStudent();
	System.out.println("count  = "+PlacedStudent.count);
	ps1.dispaly();
	PlacedStudent ps2 = new PlacedStudent(01,"Rutuj",100,"class","monitor");
	System.out.println("count  = "+PlacedStudent.count);
	ps2.dispaly();

	}	
	
}
