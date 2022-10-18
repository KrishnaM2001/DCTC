package constructor_study;

public class Use_of_para_constrcutor {
	String State;
	String State_Coad;
	public Use_of_para_constrcutor(String State_Name) {
		State = State_Name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Use_of_para_constrcutor Maharashtra =new Use_of_para_constrcutor("Maharashtra");
		Maharashtra.Member_Details("Jay karan Maurya", 28, 7571014810l, 5.11f);
		Maharashtra.Member_Details("Ajit Maurya", 29, 9451618726l, 5.3f);
		Use_of_para_constrcutor Channai =new Use_of_para_constrcutor("Channai");
		Channai.Member_Details("Satya Maurya", 25, 9554622668l, 5f);
}
	public void Member_Details(String MemberName,int Age,long Contect,float Hight) {
	System.out.println("Member name \t= "+MemberName);
	System.out.println("Member Age \t= " +Age);
	System.out.println("Member Contect no \t= " +Contect);
	System.out.println("Member Hight \t= " +Hight);
	System.out.println("Member State \t= " +State);
	
	System.out.println("==================================================");
	
	
	}
	
	


}