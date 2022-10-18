package control_statements;

public class Nested_If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String location = "hotel";
		String food_option = "rice";
		if (location == "home") {
			System.out.println("ghar ka khanan");
			if(food_option == "rice") {
				System.out.println("Dal");
			}
				else {
					System.out.println(" mix veg");}
				
		}else  {
					System.out.println("Street food");
					if (food_option=="chicken") {
						System.out.println("chicken tonight");
					}
					else {
						System.out.println("mix veg");
					}
			}
		}
		
	

		
}
		



