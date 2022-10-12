package Day2;

import java.util.Scanner;

public class Voting {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of voter=");
		int n=sc.nextInt();
		if(n>=18) {
			System.out.println("Eligible for voting");
		}
		else {
				System.out.println("Not Eligible for voting");
			}

	}

}
