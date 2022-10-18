package heirarchical_inheritence;

public class Elder_son extends Parent_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elder_son obj1=new Elder_son();
		obj1.money();
		obj1.car();
		obj1.home();
		obj1.job();
		
	}public  void home() {
		System.out.println("2 Bhk");
	} 
	public  void job() {
		System.out.println("IT company");
	} 
}
