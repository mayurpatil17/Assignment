package Day1;

import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary=");
		Double BASIC = sc.nextDouble();
		
		Double DA=BASIC*20/100;
		Double HRA=BASIC*30/100;
		Double Gross=BASIC+DA+HRA;
		System.out.println("Gross Salary will be="+Gross);
	}

}
