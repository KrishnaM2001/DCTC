package collection_study;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("arjun");//0
		v.add(500);//1
		v.add(null);//2
		v.add("arjun");//3
		v.add(null);//4
		
		
		
		System.out.println(v);
		//method of vector
		//System.out.println(v.capacity());//current*2(initial value is 10)
		//System.out.println(v.isEmpty());
		//v.clear();
		//System.out.println(v.isEmpty());
		//System.out.println(v);
		//System.out.println(v.size());
		//System.out.println(v.contains(50));
		//System.out.println(v.indexOf(null));
		//System.out.println(v.lastIndexOf(null));
		//System.out.println(v.get(3));
		//System.out.println(v.firstElement());
		//System.out.println(v.lastElement());
		//System.out.println(v);
		//v.remove(1);
		//v.add(2, "hi");
		//System.out.println(v);
		for (int i = 0; i < v.size()-1; i++) {
			System.out.println(v.get(i));
		}
		System.out.println("====================================");
		Iterator IT=v.iterator();
		while (IT.hasNext()) {
			System.out.println(IT.next());
			}
		System.out.println("=====================================");
		ListIterator LI=v.listIterator();
		while (LI.hasNext()) {
			System.out.println(LI.next());
		}System.out.println("=====================================");
		
		
		
		
		
		
	}

}
