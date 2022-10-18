package Pattern_1;

public class p_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=0;
		
		
        for(int a=1; a<=5;a++) {
	       for(int b=1; b<=y;b++) {
	          System.out.print(" ");
          }
           for (int b=1;b<=5;b++) {
            System.out.print("*");
          }
          System.out.println();
          y++;
        }
	}

}
