package multiple_class;

public class Febonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0+1+1+2+3+5+8+13+21+34+55;
		int Febno= 15;
		int a= 0;
		int b= 1;
		int c=0;
		System.out.println(a+"\n"+b);
		for (int i =3;i<=Febno;i++) {
			c=a+b;
			System.out.println("the value of Febno is "+a);
			a=b;
			b=c;
		}
		
	}

}
