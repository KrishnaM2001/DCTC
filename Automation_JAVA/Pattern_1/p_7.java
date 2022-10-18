package Pattern_1;

public class p_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=0;
		int star=5;
		for(int a=1; a<=4;a++) {
			for(int b=1; b<=space; b++) {
			 System.out.print(" ");
			}
			for (int b=1;b<=star;b++) {
				System.out.print("*");
				}
		System.out.println();
		 space++;
		 star--;
		 }
int space1= 4;
int star1=1;
for(int x=1; x<=5;x++) {
	for(int y=1;y<=space1;y++) {
	System.out.print(" ");
	}
	for (int y=1; y<=star1;y++) {
		System.out.print("*");
	}System.out.println();
	space1--;
	star1++;
}
	}

}
	