package Day4;

class employee {
	
	  int idNum; 
	  String name;
	
	  public static void main(String[] args) {
	    employee [] st = {new employee(), new employee()};


	    st[0].idNum = 100;
	    st[0].name = "Mayank";
	    st[1].idNum = 101;
	    st[1].name = "Suraj";

	    //displaying Student objects values after initialization
	    System.out.println("employee details:");
	    for (int i=0; i < st.length; i++) {
	      System.out.println("Employee" + (i+1)
	                +" idNumber: "+st[i].idNum);
	      System.out.println("Employee"+(i+1)+" name: "+st[i].name);
	    }
	  }

	}
