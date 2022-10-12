package Day5.Program5;

public class TestEmployee {
	public static void main(String[] args) {
     Employee[] obj = new Employee[2];
     
     obj[0]=new Employee(1, "Mayur");
     obj[1]= new Employee(2, "Jitendra");
     
     System.out.println("---------Employee 1-------");
     obj[0].show();
     System.out.println("---------Employee 2-------");
     obj[1].show();
      
      
	}

}
