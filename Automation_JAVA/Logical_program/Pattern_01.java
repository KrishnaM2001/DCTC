package Logical_program;

public class Pattern_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=1;
		int k=4;
		for (int z=1; z<=5;z++) {
		for(int y=1;y<=w;y++) {
				System.out.print("*");
			}
			System.out.println( );
			w++;
		}
			for(int l=1;l<=4;l++) {
				for(int m=1;m<=k;m++) {
					System.out.print("*");
				}
				System.out.println();
				k--;
			
		}
	}
}
