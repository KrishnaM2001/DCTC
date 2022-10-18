package Practice_variable;

public class Local_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		//if variable is in main method then
				//to call local variable directlly
		System.out.println(i);
		// to call local var from another method
		static2_method();
		//to call globalvar from another class
		System.out.println(Global_var.A);
		
	}
	public static void static2_method() {
		int j=30;
		System.out.println(j);
	}

}
