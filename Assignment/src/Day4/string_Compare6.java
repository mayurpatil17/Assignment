package Day4;

public class string_Compare6 {
	public static void main(String[] args) {
		String s1="mayur"; //literal way
		String s2="mayur";
		System.out.println(s1==s2);        //(equal-equal operator checks address)
		System.out.println(s1.equals(s2)); //(.equal method checks content)
		String s3=new String("mayur"); //using new keyword
		String s4=new String("mayur");
		System.out.println(s3==s4);         //(equal-equal operator checks address)
		System.out.println(s3.equals(s4));  //content(.equal method)

	}
}

