package casting_study;

public class Child_class extends Parent_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for up casting
		//Parent_class ref_var=new Child_class();
		Parent_class obj=new Child_class();
		obj.car();
		obj.gold();
		obj.bike();
	}
public void bike() {
	System.out.println("R1");
}
public void gold() {
	System.out.println("500 gm");
}
}
