package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [4];
		a[0]=25;
		a[1]=44;
		a[2]=53;
		a[3]=15;
		System.out.println(a.length);
		for (int i = 0; i <= a.length-1; i++) {
			System.out.println(a[i]);
		}
		for (int i = a.length-1; i>=0; i--) {
			System.out.println(a[i]);
			
		}
//		Arrays.sort(a);
//		for (int i = 0; i <=a.length-1; i++) {
//			System.out.println(a[i]);
//		}
//		for (int i = a.length-1; i>=0; i--) {
//			System.out.println(a[i]);
//		}
}
}