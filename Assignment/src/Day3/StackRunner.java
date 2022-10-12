package Day3;

public class StackRunner {

	public static void main(String[] args) {
		Stack num = new Stack();
		num.push(15);
		num.push(8);
		num.push(10);
		
		System.out.println(num.pop());
		
		num.show();

	}

}
