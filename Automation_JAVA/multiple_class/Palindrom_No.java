package multiple_class;

public class Palindrom_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12321;
		int temp =a;
		int reminder;
		int reversedNo=0;
		
		while(a>0) {
			reminder = a/10;
		reversedNo= reversedNo*10+reminder;
		a=a/10;
		}if (temp==reversedNo) {
			System.out.println("No is Palindrom");
		}else {System.out.println("No is not Palindrom");
		
		}
}

}

