package Pattern_1;

public class p_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=5;
		int star=1;
        for(int a=1; a<=5;a++) {
	       for(int b=1; b<=space;b++) {
	          System.out.print(" ");
          }
           for (int b=1;b<=star;b++) {
            System.out.print("*");
          }
          System.out.println();
          space--;
          star++;
	}int space1=0;
	int star1=6;
	for(int i=1;i<=6;i++) {
		for (int j=1;j<=space1;j++) {
		System.out.print(" ");
	}for(int j=1;j<=star1;j++) {
		System.out.print("*");
	}System.out.println();
	space1++;
	star1--;
	}
	}

}
