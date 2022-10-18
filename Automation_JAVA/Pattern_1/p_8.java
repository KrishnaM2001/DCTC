package Pattern_1;

public class p_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=5;
		int star=1;
		for (int a=1;a<=5;a++) {
			for(int b=1;b<=space;b++) {
				System.out.print(" ");
			}
			for(int c=1; c<star*2; c++) {
				System.out.print("*");
				}
		
		System.out.println();
		space--;
		star++;
		}

	}

}
