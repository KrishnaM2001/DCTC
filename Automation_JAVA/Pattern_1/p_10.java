package Pattern_1;

public class p_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=0;
		int star=5;
		for(int x=1;x<=4;x++) {
			for(int y=1;y<=space;y++) {
				System.out.print(" ");
			}for (int z=1;z<star*2;z++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
	int space1=5;
		int star1=1;
		for(int i=1;i<=5;i++) {
			for (int j=1;j<space1;j++) {
				System.out.print(" ");
		}for(int k=1;k<star1*2;k++) {
			System.out.print("*");
			}
		System.out.println();
			space1--;
			star1++;
		

	}

}
}
