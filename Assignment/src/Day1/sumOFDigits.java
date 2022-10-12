package Day1;

import java.util.Scanner;

//Accept three digit number via CLA* and calculate the sum of digit?
public class sumOFDigits {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter any three digit number:");
    	 int n = sc.nextInt();
    	 int sum=0,rem=0;
		while(n!=0)
		{
		    rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println("Sum of Digits: "+sum);
	}
}
