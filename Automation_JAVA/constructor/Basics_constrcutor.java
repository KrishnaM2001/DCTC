package constructor;

public class Basics_constrcutor {
	int a = 40;
    public Basics_constrcutor() {
    	System.out.println("i am user defined constrcutor");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new = memory allocation
    Basics_constrcutor obj = new Basics_constrcutor();
    
    System.out.println(obj.a);
    
	}

}
