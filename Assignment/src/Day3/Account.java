package Day3;

import java.util.Scanner;

public class Account {

	private int id;
	private double balance; //balance for account

	Scanner scan=new Scanner(System.in);
	// no arg constructor for default account 
	Account() {
		id = 0;
		balance = 0.0;

	}
	//constructor with specfic id and initial balance
	Account (int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}

	public void setId (int newId) { 
		id = newId;
	}
	public void setBalance (double newBalance) {
		balance = newBalance;
	}

	double withdraw () {  

		System.out.println("withdraw amount :" );
		double amount=scan.nextDouble();
		if(amount<=balance) {
			balance = balance-amount;

		}
		else {
			System.out.println("insuffiecient balance");
		}
		return balance;

	}
	 
	double deposit() {

		System.out.println("deposit amount :");
		double amount=scan.nextDouble();

		return balance = balance+ amount;
	}

	public static void main(String[] args) {

		Account account1 = new Account (1122, 20000); 
		System.out.println("Account ID:" + " " + account1.id);
		System.out.println("Initial Balance:" + account1.getBalance());

		System.out.println("Balance after Withdraw:" + " " + account1.withdraw());
		System.out.println("Balance after deposit" + " " + account1.deposit()); System.out.println("------------------------");
		System.out.println("The Process is complete");
		System.out.println("------------------------");
	}

}