package Pattern_1;

public class P_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=2;
		System.out.println("*");
        for (int a=2;a<=4;a++) {
        	System.out.print("*");
        	for(int b=3;b<=space;b++) {
        		System.out.print(" ");
        	}
        	System.out.print("*");
        	System.out.println();
        	space++;
        }
        System.out.println("*****");
	}

}
