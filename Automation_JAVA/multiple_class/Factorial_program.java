package multiple_class;

public class Factorial_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 5;
		int b= 1;
		for (int i= 1;i<=a;i++ ) {
			System.out.print("Value of b at start="+b);
			b=b*i;
			//b=1,b=2,b=6,b=24,b=120;
			System.out.println("Value of i at current loop="+i+"Value of b after operation="+b);
		}
		System.out.println("Factorial of A="+a+"is ="+b);
	}

}
