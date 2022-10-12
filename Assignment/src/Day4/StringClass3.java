package Day4;

public class StringClass3 {

	public static void main(String[] args) {
		String s=" Mayur Patil";
		String s1="mayur Patil";
		
		System.out.println(s.length());


		System.out.println(s.equals(s1));
		
		System.out.println(s1.replace('m','M'));
		System.out.println(s.trim());
		System.out.println(s.substring(2));
		System.out.println(s.concat(s1));
		System.out.println(s.compareTo(s1));
		System.out.println(s.charAt(3));
		
		

	}

}
