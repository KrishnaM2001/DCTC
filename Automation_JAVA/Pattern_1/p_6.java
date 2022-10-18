package Pattern_1;

public class p_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int space=0;
int star=5;
		for(int a=1;a<=5;a++) {
			for (int b=1;b<=space;b++) {
			System.out.print(" ");
		}for(int b=1;b<=star;b++) {
			System.out.print("*");
		}System.out.println();
		space++;
		star--;
		}
	}

}
