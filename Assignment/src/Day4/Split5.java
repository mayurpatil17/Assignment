package Day4;
//Write a java program to split string by “blank space” and “-” patterns?
public class Split5 {

	public static void main(String[] args) {
		
			String str1 = "Mayur Kishor Patil";
			String str2 = "My name is Mayur-Patil";
			String str3[] = new String[1];
			String str4[]=new String[2];
			str3 = str1.split("\\s");
			System.out.println("String after split by space:");
			for (int i = 0; i < str3.length; i++) {
				System.out.println(str3[i]);
			}
			str4 = str2.split("-");
			System.out.println("String after split by  -:");
			for (int i = 0; i < str4.length; i++) {
				System.out.println(str4[i]);
			}
		}
}
