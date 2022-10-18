package collection_study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class Linklist_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(null);
		l.add(10);
		l.add(null);
		
		Iterator IT= l.iterator();
		while (IT.hasNext()) {
			System.out.println(IT.next());
			}
		System.out.println("================");
		ListIterator LI=l.listIterator();
		while (LI.hasNext()) {
			System.out.println(LI.next());
		}System.out.println("=====================================");
	}

}
