package collection_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList AL=new ArrayList();
	    ArrayList AL = new ArrayList();
		//obj.add(data);
		AL.add(50);//0
		AL.add(null);//1
		AL.add(15);//2
		AL.add(50);//duplicate//3
		AL.add(null);//4
		AL.add("Krishna");//5
		AL.add("A");//6
		AL.add(true);//7
		AL.add(123456780l);//8
		AL.add(12345.5555f);//9
		AL.add(12345.5555);//10
		//System.out.println(AL);
		//obj.get(index);
		//System.out.println(AL.get(8));
		//System.out.println(AL.size());
		//AL.remove(4);
		//System.out.println(AL);
		AL.add(4, "Arjun");
		//System.out.println(AL);
		//System.out.println(AL.get(5));
		//array list methods
		//AL.clear();
		//System.out.println(AL);
		//System.out.println(AL.get(6));
		//System.out.println(AL.indexOf(123456780l));
		//System.out.println(AL.size());
		//System.out.println(AL.isEmpty());
		//System.out.println(AL.contains(50));
		//System.out.println(AL.lastIndexOf(5));
		//AL.set(9, false);//update
		for (int i=1;i<=AL.size()-1;i++) {
		System.out.println(AL.get(i));
		}
		
		//Iterator
		Iterator it=AL.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		
		//while(it.hasNext()) {
		//	System.out.println(it.next());
		//}
		//System.out.println("===============");
		//ListIterator  LI =AL.listIterator();
		//while(LI.hasNext());{
		//	System.out.println(LI.next());
		//}
		//for each 
		//for( Object O:AL) {
		//	System.out.println(O);
		//}
	}

}
