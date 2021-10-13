package bankaccountApp;

public abstract class Account implements IRate{
//	List common properties for savings and checking accounts
	private String name;
	private String sSn;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
//	Consstructor to set base properties and initialize the account 
	public Account(String name, String sSN, double initDeposit) {
	this.name = name;
	this.sSn = sSN;
	balance = initDeposit;
	
	//Set account number
	index++;
	this.accountNumber = setAccountnumber();
	
	setRate();
	
//	System.out.println("Account number: "+this.accountNumber);
	}
	
	public abstract void setRate();
	
	private String setAccountnumber() {
		String lastTwoOFSSN = sSn.substring(sSn.length()-2, sSn.length());
		int uniqueID = index;
		return lastTwoOFSSN + uniqueID;
	}
	
	public void compound() {
		double accruedInterest = balance*(rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $"+ accruedInterest);
		printBalance();
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing: "+ amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing: "+ amount);
		printBalance();
	}
	public void printBalance() {
		System.out.print("Your Account Balance is: $");
		System.out.printf("%.2f", balance);
		System.out.println();
		
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering: " + amount+"to "+ toWhere);
	}
//	List common methods
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: "+ accountNumber+
				"\nBALANCE: "+ balance +
				"RATE: " + rate + "%"
				);
	}
}
