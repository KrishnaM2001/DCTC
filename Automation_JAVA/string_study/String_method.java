package string_study;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String k="krishna";
String I="Krishna";
String K=new String("krishna");
System.out.println(k.length());//return lenght /no of characters
System.out.println(K.toUpperCase());//convert case into upper case
System.out.println(K.toLowerCase());//convert case into lower case
System.out.println(k.equals(K)); // it will compare defination considering case check true or false( Conclude with there cases)
System.out.println(I==K);//will compare memory allocation(if non constant pool area have new memory location )
System.out.println(K.equalsIgnoreCase(I));
System.out.println(k.contains("K"));//to check geven contain is there or not 
System.out.println(K.isEmpty());//to represent null or nothing statement
System.out.println(K.charAt(4));
for (int i= 0;i<=6;i++) {
	System.out.println(K.charAt(i));
	
}
System.out.println("+++++++++++++++++++++++++++++++++++");



	}

}
