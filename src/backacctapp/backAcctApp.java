package backacctapp;

public class backAcctApp {
	public static void main(String[] args) {
		
		Checking acct1 = new Checking("Skuld","00000000099",2000);
		Savings acct2 = new Savings("XIII","00000000001",1000);

		acct1.showInfo();
		acct1.compound();
		System.out.println("****************");
		acct2.showInfo();
		acct2.compound();
		System.out.println("****************");
		acct1.deposit(1000);
		acct2.withdraw(1000);
		acct1.transfer(acct1, acct2, 1000);
		//Read CSV file
		
		//Create New Accounts based on data
	}
}
