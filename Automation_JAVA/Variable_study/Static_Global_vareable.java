package Variable_study;

public class Static_Global_vareable {
	//global variable
	//static global variable
	//for call
	//static datatype= value;
	static int A=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int A=50;
 //to call static global variable call directly
 System.out.println("local var call= "+A);
 Static_method();
 System.out.println(Static_Global_vareable.A);
//to call global var when locally we have same var 
System.out.println("global var call= "+Static_Global_vareable.A);

	}
	
	public static void Static_method() {
		int A= 30;
		System.out.println(A);
	}
	public void NonStatic_method() {
		int c=20;
		System.out.println(c);
	}
	

}
