package constructor;

public class Parameterized_constrcutor {
	String Country;
	
	public Parameterized_constrcutor(String Country_Name) {
		Country = Country_Name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_constrcutor India = new Parameterized_constrcutor("India");
		System.out.println(India.Country);
		Parameterized_constrcutor UK = new Parameterized_constrcutor("UK");
		System.out.println(UK.Country);
	}
	
}
