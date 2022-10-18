package array;

import java.util.Scanner;

public class fitht_largest_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {15,5,7,15,24,85,1562,156215,125};                        // Line 1
			  Scanner sc = new Scanner(System.in);              // Line 2
			  //System.out.println("Enter the nth position");     // Line 3
			  int n = sc.nextInt();                             // Line 4
			  if(5<= arr.length){                               // Line 5
			    int element = arr[5-1];                         // Line 6
			   System.out.println(element);                      // Line 7
			 }                     
			   else {
			   System.out.println("Enter any position upto" + arr.length); //Line 8
			      }
			}
		
	}
	

