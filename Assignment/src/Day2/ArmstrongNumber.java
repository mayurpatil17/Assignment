package Day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153,rem=0,temp=n;
		while(temp!=0) {
			rem=temp%10;
			temp=temp/10;
			temp=temp+(rem*rem*rem);	
		}
		if(temp==n) {
			System.out.println(temp+" is an armstrong number");
			}
			else {
				System.out.println(temp+" is not an armstrong number");
			}
	
	}
	

}
