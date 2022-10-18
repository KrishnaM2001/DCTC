package Variable_study;

public class Type_of_var {
 static int A=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staic_method();
		nonstaic_method();
		//to call global var 
		System.out.println(Type_of_var.A);
	}
	
	public static void staic_method() {
		int b=50;
		System.out.println("the value of B is ="+b);
	}
	public static void nonstaic_method() {
		int c=40;
		System.out.println("the value of C is ="+c);
	}
	

}
