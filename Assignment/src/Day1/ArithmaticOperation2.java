package Day1;

import java.util.Scanner;

public class ArithmaticOperation2{

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

	        System.out.println("Enter any two float integer numbers:");

	        
	        Float a = s.nextFloat();
	        Float b = s.nextFloat();
	        Float sum, sub, mul, mod,div;
	       

	        sum = a + b;
	        sub = a - b;
	        mul = a * b;
	        div = a / b;
	        mod = a % b;

	        System.out.println("SUM         " + a + " + " + b + " = " + sum);
	        System.out.println("DIFFERENCE  " + a + " - " + b + " = " + sub);
	        System.out.println("PRODUCT     " + a + " * " + b + " = " + mul);
	        System.out.println("QUOTIENT    " + a + " / " + b + " = " + div);
	        System.out.println("MODULUS     " + a + " % " + b + " = " + mod);

	}

}
