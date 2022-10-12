
public class mail {
	public static void main(String[] args) {
		String s="Mayurpatil638@gmail.com";
		StringBuffer alpha = new StringBuffer();
		StringBuffer special = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer upper = new StringBuffer();


		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i)))
			{
				alpha.append(s.charAt(i));
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				num.append(s.charAt(i));
			}	
			else if(Character.isUpperCase(s.charAt(i)))
			{
				upper.append(s.charAt(i));
			}
			else 
			{
				special.append(s.charAt(i));
			}
		}
		System.out.println(alpha);
		System.out.println(special);
		System.out.println(num);
		System.out.println(upper);

	}

}



