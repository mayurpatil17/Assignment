package Day5.Program5;

public class Employee{

	int empId;
	String eName;
	
	Employee(int id, String name){
		this.empId=id;
		this.eName=name;
	}
	
	public void show() {
		System.out.println("Employee ID:"+empId);
		System.out.println("Employee Name:"+eName);
		System.out.println();
	}

}
