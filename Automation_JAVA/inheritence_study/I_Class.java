package inheritence_study;

public class I_Class extends I_3class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bike();
I_Class obj = new I_Class();
obj.ecar();
obj.supercar();
obj.car();
	}
	public static void bike() {
		System.out.println("1 lakh");
	}
	public void ecar() {
		System.out.println("15 lakh");
	}

}
