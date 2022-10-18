package array;

import java.util.Scanner;

public class Array_pp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a="sumit pawankar";
		//String [] b=a.split("  ");
		//System.out.println(a);
		int [] arr = {15,5,7,15,24,85,1562,156215,125};
		
		//Arrays.sort(A[0]);
		
		
		//System.out.println(A[0][A[0].length-1]);
		//Arrays.sort(A[1]);
		//System.out.println(A[1][A[1].length-1]);
		//System.out.println(A[1][3]);
		//int b[]= {1,25};
		//Arrays.sort(b);
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		if(5<arr.length) {
		
		int element =arr[5-1];
		System.out.println(element);
		}
		else {
			   System.out.println("Enter any position upto" + arr.length);
			  
			      }
			
	}
		
//		for (int i=0; i<=A.length-1;i++) {
//			for(int j=0; j<=A[i].length-1;j++) {
//				System.out.print(A[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		System.out.println();
}
