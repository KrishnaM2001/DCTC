package Pattern_1;

public class P_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=1;
		
		for (int z=1; z<=5;z++) {
		for(int y=1;y<=w;y++) {
				System.out.print("*");
			}
			System.out.println( );
			w++;
		}
		int k=4;
			for(int l=1;l<=4;l++) {
				for(int m=1;m<=k;m++) {
					System.out.print("*");
				}
				System.out.println();
				k--;
			
		}
	}

}
