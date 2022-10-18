package Variable_study;

public class Global_call_another_class {
	static int A=5000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int A=1000;
	//to call local
	System.out.println(A);
    //to call global var
	System.out.println(Global_call_another_class.A);
	//to call static global from another class
	System.out.println(Static_Global_vareable.A);
	}

}
