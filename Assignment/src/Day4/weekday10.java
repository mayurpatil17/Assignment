package Day4;

public enum weekday10 {
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);
	
	private int value;
	private weekday10(int value){  
		this.value=value;  }
	
	public static void main(String args[]){  

		for (weekday10 d : weekday10.values()){  
			
			System.out.print(d.value+""+d+" ");
		}  

}
	

}
	