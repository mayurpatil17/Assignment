package Day5.Program4;

public class Employee {

	int fixedsalary;
	int incentives;
	String name;
	int id;
	
	
	Employee(int id,String name,int fixed,int incentive)
	{
		this.fixedsalary=fixed;
		this.incentives=incentive;
		this.name=name;
		this.id=id;
	}
	
	int computeSalary() {
		int computeSalary=fixedsalary+incentives;
		return computeSalary;
		
	}
	public void display() {
		System.out.println("Emplyee details:--------");
		System.out.println("Id="+id);
		System.out.println("Ename="+name);
		System.out.println("Fixed="+fixedsalary);
		System.out.println("Incentive="+incentives);
		System.out.println("Compute salary="+computeSalary());
		System.out.println();
		
	}

}
