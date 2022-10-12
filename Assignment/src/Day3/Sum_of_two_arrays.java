package Day3;

import java.util.Scanner;

public class Sum_of_two_arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE AND VALUES IN THE ARRAY 1");
		int s1=sc.nextInt();
		int[] a1=new int[s1];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
			
		//array2
		System.out.println("ENTER THE SIZE AND VALUES IN THE ARRAY 2");
		int s2=sc.nextInt();
		int[] a2=new int[s2];
		for(int i=0;i<a2.length;i++) {
			a2[i]=sc.nextInt();
		}
		int[] ans=new int[s1>s2? s1:s2]; //ternary opertor
		int i=s1-1; int j=s2-1; int k=ans.length-1;
		int c=0;
		while(k>=0) {
			int sum =0;
			if(i>=0) sum +=a1[i];
			if(j>=0)sum+=a2[j];
			sum += c;
			
			c=sum/10;
			sum =sum%10;
			
			ans[k]=sum;
			i--;
			j--;
			k--;
		}
		System.out.println("third array will be:");
	  if(c>0)System.out.println(c);
 for(int x:ans) System.out.println(x);
}
		}