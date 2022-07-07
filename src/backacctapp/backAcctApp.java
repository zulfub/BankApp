package backacctapp;

public class backAcctApp {
	public static void main(String[] args) {
		
		Checking acct1 = new Checking("Skuld","00000000099",0001);
		Savings acct2 = new Savings("XIII","00000000001",0001);
		
		acct2.showInfo();
		System.out.println("****************");
		acct1.showInfo();
		
		
		//Read CSV file
		
		//Create New Accounts based on data
	}
}
