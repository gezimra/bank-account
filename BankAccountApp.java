package bankaccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		String file ="C:\\Users\\Lenovo\\Downloads\\NewBankAccounts.csv";
		
	/*	Checking chkacc1 = new Checking("Tom Cruise","123456789",1234);
		
		Savings savacc1 = new Savings("Rich Love","123456798",4321);
		System.out.println("***********");
		savacc1.compound();
		System.out.println("***********");
		savacc1.showInfo();
//		System.out.println("***********");
//		chkacc1.showInfo();
		
		savacc1.compound();*/ 
	
		// Read a CSV File then create new accounts based on that data
		
		List newAccountHolder = (List) utilities.CSV.read(file);
		for (String[] AccountHolder : newAccountHolder) {
			System.out.println(AccountHolder[1]);
			System.out.println(AccountHolder[2]);
			System.out.println(AccountHolder[3]);
		}
	}

}
