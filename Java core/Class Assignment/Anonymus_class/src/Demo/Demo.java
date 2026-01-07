package Demo;

interface mall{
	void discount();
}

class fashionMall implements mall{
	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("Discount - 20%");
	}
}

public class Demo{
	public static void main(String[] args) {
		mall m1  = new fashionMall();
		m1.discount();
		
		mall m2 = new fashionMall();
		m2.discount();
		
		new mall(){
			public void discount() {
				System.out.println("50% Discount applied");
			}
		}.discount();;
	}
}