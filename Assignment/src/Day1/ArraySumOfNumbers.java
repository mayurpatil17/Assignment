package Day1;

import java.util.Scanner;

public class ArraySumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input how many numbers you want in array?");
		int n = sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
		  arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			  System.out.println("arr["+i+"]="+arr[i]);
			    sum=sum+arr[i];
			}
		System.out.println(sum);
	}

}
