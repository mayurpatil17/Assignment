package Day3;

public class Singleton {

	public static void main(String[] args) {
		A obj1 = A.getInstance();
		A obj2 = A.getInstance();

	}

}
class A {
	static A ref= new A();
	private A(){
		System.out.println("Constructor invoke only one object.");
		
	}
	public static A getInstance()
	{
		return ref;
		
	}	
	
	
}
