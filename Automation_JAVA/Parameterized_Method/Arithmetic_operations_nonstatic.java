package Parameterized_Method;

public class Arithmetic_operations_nonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // System.out.println("non static Regular method ");
  
 
 Arithmetic_operations_nonstatic Z1=new Arithmetic_operations_nonstatic();
 Z1.substraction(34,15);
 Z1.Division(60,15);
 Z1.Addition(20,5);
 Z1.Multiplication(25,4);
	}
	public void substraction(int a, int b)
	{
		int C;
		C=a-b;
		System.out.println("Substraction of a & b ="+C);
		
	}
	public void Division(int a, int b)
	{
		int C;
		C=a/b;
		System.out.println("Division of a & b ="+C);
		
	}
	public void Addition(int a, int b) {
		int C= a+b;
		System.out.println("Addition of a & b is="+C);
	}
	
	public void Multiplication(int a, int b) {
		int C= a*b;
		System.out.println("Multiplication of a & b is="+C);
	}
}

