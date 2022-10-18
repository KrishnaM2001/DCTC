package interface_study2;

public class JIO implements TRAI {
int sms =5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JIO z=new JIO();
		z.SMS();
		
	}

	@Override
	public void SMS() {
		// TODO Auto-generated method stub
		System.out.println("100 sms/day"+ TRAI.sms);
	}

	@Override
	public void CALL() {
		// TODO Auto-generated method stub
		System.out.println("Unlimited call");
	}
     public void OTT() {
	System.out.println("JIO TV");
    }
}
