package Day1;

import java.util.Scanner;
//5. Accept five different values via CLA* by using for loop and display sum of that values

public class ForLoopSumOFDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the five numbers:");
		int sum=0;
		for(int i=1;i<=5;i++) {
			int n = sc.nextInt();
			sum=sum+n;	
		}
		System.out.println("sum of five numbers= "+sum);
		
		

	}

}
