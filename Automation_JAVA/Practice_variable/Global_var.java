package Practice_variable;

public class Global_var {
static int A=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to call  static global variable directly
		int A=20;
		System.out.println("local var call="+A);
	    //to call global var when locally we have same var
		//System.out.println(classname.var);
		System.out.println("global var call="+Global_var.A);
		//to call global variable in same class in nonstatic method
		//class name obj=new class name
		//obj.method name();
		 Global_var obj=new  Global_var();
		 obj.nonstatic1_method();
	}
	
	public void nonstatic1_method() {
		
		int A=10;
		//to call nonstatic global var call directly
		System.out.println("local var call="+A);
	    //to call global var when locally we have same var
		//System.out.println(classname.var);
		System.out.println("global var call="+Global_var.A);
		}
	
	}
