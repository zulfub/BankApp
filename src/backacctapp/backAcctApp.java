package backacctapp;

import java.util.LinkedList;
import java.util.List;

public class backAcctApp {
	public static void main(String[] args) {
		List<Account> acctList = new LinkedList<Account>();
		Account acct = null;
		//Read CSV file
		String filePath = "..//BankApp//CSV/NewBankAccounts.csv";
		List<String[]> newAccts = utilities.CSV.read(filePath);
		//Create New Accounts based on data
		for(String[] newAcctHolder : newAccts) {
			String Acctname = newAcctHolder[0];
			String TCKN = newAcctHolder[1];
			String acctType = newAcctHolder[2];
			double initialBalance=Double.parseDouble(newAcctHolder[3]);
			if(acctType.equalsIgnoreCase("Checking")) {
				
				 acct = new Checking(Acctname,TCKN,initialBalance);
			}
			else if(acctType.equalsIgnoreCase("Savings")) {
				 acct = new Savings(Acctname,TCKN,initialBalance);
			}
			acctList.add(acct);
			acct.showInfo();
		}
	}
}
