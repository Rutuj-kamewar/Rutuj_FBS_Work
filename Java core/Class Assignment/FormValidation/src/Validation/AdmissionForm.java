package Validation;


public class AdmissionForm {

	String studentName;
	int age;
	double persentage;
	double courseFees;
	double feesPaid;
	
	static int courseFee = 10000;
	
	//Constructor Parametrized
	public AdmissionForm(String studentName, int age, double persentage, double courseFees, double feesPaid) {
		this.studentName = studentName;
		this.age = age;
		this.persentage = persentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}
	
	
	//default
	public AdmissionForm() {
		this.studentName = " ";
		this.age = 0;
		this.persentage = 0;
		this.courseFees = 0;
		this.feesPaid = 0;
	}

	//Setters and Getters
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getPersentage() {
		return persentage;
	}


	public void setPersentage(double persentage) {
		this.persentage = persentage;
	}


	public double getCourseFees() {
		return courseFees;
	}


	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}


	public double getFeesPaid() {
		return feesPaid;
	}


	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	
	//methods
	
	void validateForm(AdmissionForm a) throws EmptyNameException, UnderAgeException, NotFitForAdmissionException, FeesNotPaidException, InsufficientFeesException {
		
		if(a.studentName == null || a.studentName =="") {
			throw  new EmptyNameException();
		}
		else if(a.age<17) {
			throw new UnderAgeException();
		}
		else if(a.persentage<0 || a.persentage>100) {
			throw new NotFitForAdmissionException();
		}
		else if(a.feesPaid == 0) {
			throw new FeesNotPaidException();
		}
		else if(a.feesPaid < (courseFee*0.3)) {
			throw new InsufficientFeesException() ;
		}
		else {
			System.out.println("You are good to go!!");
		}

	}
	
	class Test {

	    public static void main(String[] args) {
	        AdmissionForm a = new AdmissionForm("rutuj", 16,39,5000,3000);

	        try {
	            a.validateForm(a);
	        }
	        catch (EmptyNameException ime) {
	            System.out.println(ime);
	        }
	        catch (UnderAgeException ime) {
	            System.out.println(ime);
	        }
	        catch (NotFitForAdmissionException ime) {
	            System.out.println(ime);
	        }
	        catch (FeesNotPaidException ime) {
	            System.out.println(ime);
	        }
	        catch (InsufficientFeesException ime) {
	            System.out.println(ime);
	        }
	    }
	}
	

	
	
	
	
	
	
}
