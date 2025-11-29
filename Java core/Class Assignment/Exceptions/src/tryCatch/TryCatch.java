package tryCatch;

class TryCatchTest {
   public static void main(String[]args) {
	   
	   
	   try {
//	   System.out.println(args.length);
	   int a = Integer.parseInt(args[0]);
	   int b = Integer.parseInt(args[1]);
	   int c =  a/b;
	   System.out.println(c);
	   }  
	   
	   catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("Please provide two inputs!");
	   }
	   catch(ArithmeticException w) {
		   System.out.println("second input must be positive!");
	   }
	   catch(Exception e) {
		   System.out.println("Opps Something went wrong!!");
	   }
   }
}
