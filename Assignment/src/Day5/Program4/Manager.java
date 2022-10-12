package Day5.Program4;

public class Manager extends Employee {

	Manager(int id, String name, int fixed, int incentive) {
		super(id, name, fixed, incentive);

	}

	public static void main(String[] args) {
		
	  Manager m = new Manager(1, "Mayur", 10000, 5000);
	  Manager m1 = new Manager(2, "Akshay", 5000, 5000);
	  m.display();
	  m1.display();
	  
	  
	}
}
