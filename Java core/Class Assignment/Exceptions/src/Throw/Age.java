package Throw;

public class Age {

	
	int age;
	Age(int age){
		this.age  = age;
	}
	
	void validate() {
		if(this.age<18) {
			
			try {
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException iae){
				System.out.println(iae);
			}
		}
		else {
			System.out.println("your are Eligible for Voting");
		}
	}
	
}

class Test{
	
	public static void main(String[]args) {
		Age a = new Age(17);
		a.validate();
	}
}
