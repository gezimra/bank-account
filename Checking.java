package bankaccountApp;

public class Checking extends Account {
//	List properties specific to a checking account 
	private int debitCardNumber;
	private int debitCardPin;
//	Constructor to initialize checking account properties 
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2"+accountNumber;
		setDebitCard();
	}
	@Override
	public void setRate() {
		System.out.println("Implement Rate for Checking");
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random()*Math.pow(10, 12));
		debitCardPin = (int) (Math.random()*Math.pow(10, 4));
		System.out.println("CARD: "+ this.debitCardNumber);
		
	}
	
//	List any methods specific to the checking
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account features: "+
						   "\nDebit Card NUMBER: "+ this.debitCardNumber+
						   "\n Debit Card PIN: "+ this.debitCardPin);
	}
}
