package Prectice_java;

public class pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=1;
int y=5;
		for(int a=1;a<=5;a++) {
			for (int b=1;b<=y;b++) {
				System.out.print("*");
			}
			for (int b=1; b<=x;b++) {
				System.out.print(" ");
			}
			System.out.println();
			x++;
			y--;
			}
	}

}
