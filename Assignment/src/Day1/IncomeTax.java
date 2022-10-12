package Day1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the basic salary= ");
		double basic = sc.nextDouble();
		if(basic>0 && basic <4000) {
			System.out.println(basic*4/100);
		}
		else if(basic>=4000 && basic<10000) {
			System.out.println(basic*6/100);
		}
		else if(basic>=10000 && basic<17000) {
			System.out.println(basic*8/100);
		}
		else if(basic>=17000 && basic<27000) {
			System.out.println(basic*10/100);
		}
		
		else {
			System.out.println(basic*15/100);
		}
	}

}
