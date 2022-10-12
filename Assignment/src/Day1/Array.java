package Day1;
//Accept values via CLA* for 1-D array of integer type and display it on screen.

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("How many numbers for input:");
		 int n = sc.nextInt();
		 
		    int arr[] = new int[n];
	        System.out.println("Enter the numbers: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        for (int i = 0; i < n; i++) {
	        	System.out.println("arr["+i+"] = "+arr[i]);
	        }
	        
	 
		
	}

}
