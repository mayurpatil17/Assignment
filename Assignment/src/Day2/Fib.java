package Day2;

public class Fib{
	public static void main(String[] args) {
		int m=1,n=1,fib=0;
		for(int i=1;i<=7;i++)
		{
			System.out.println(m);
			fib=m+n;
			m=n;
			n=fib;
		}
		
	}

}
