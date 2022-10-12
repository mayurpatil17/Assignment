package Day4;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Integer Values:");
		int n = Integer.parseInt(s.nextLine());
		
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		
		String hexa = Integer.toHexString(n);
		System.out.println(hexa);
		
		String octa = Integer.toOctalString(n);
		System.out.println(octa);
		
		
		
		
		

	}

}
