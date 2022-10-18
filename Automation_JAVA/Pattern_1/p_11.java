package Pattern_1;

public class p_11 {

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
		int space1=2;
		int star1=4;
		for(int x=1;x<=4;x++) {
			for(int y=1;y<=space1;y++) {
			System.out.print(" ");
			}
			for (int z=1;z<star1*2;z++) {
				System.out.print("*");
			}System.out.println();
			space1++;
			star1--;
	}

}
}