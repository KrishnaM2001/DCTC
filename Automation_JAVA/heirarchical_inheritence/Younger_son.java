package heirarchical_inheritence;

public class Younger_son extends Parent_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Younger_son obj=new Younger_son();
		obj.Books();
		obj.money();
		obj.Bike();
		obj.car();
	}
	public  void Books() {
		System.out.println("ab_d");
	} 
	public  void Bike() {
		System.out.println("Ktm");
	} 

}
