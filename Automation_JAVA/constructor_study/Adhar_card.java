package constructor_study;

public class Adhar_card {
	
//String State;
Adhar_card(String StateName){
	//State= StateName;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Adhar_card z=new  Adhar_card("Maharashtra");
		 z.AdharDetails("arjun", 12345, 987654321);
	}
	public void AdharDetails(String Name,int MobNo,int AdharNo) {
		System.out.println("User Name is    = " +Name);
		System.out.println("User MobNo is   = " +MobNo);
		System.out.println("User Adhar No is= " +AdharNo);
		//System.out.println("User state is   = " +State);
		System.out.println("========================================");
		
	}

}
