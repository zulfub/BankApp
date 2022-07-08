package backacctapp;

public abstract class Account implements InterestBaseRate {
	
	//Comment Properties for checking account and saving account
	private String name;
	private String TCKN;
	private double balanceAmt;
	private static int index= 10000;
	
	protected String acctType;
	protected double rate;
	protected String acctNumber;
	
	//Constructor - Base properties and initialize account
	
	public Account(String name,String TCKN,double balanceAmt) {
		
		this.name = name;
		this.TCKN = TCKN;
		this.balanceAmt = balanceAmt;
		//Set Account number
		index++;
		this.acctNumber = setAccountID();
		this.rate = getBaseRate();
		
		setRate();
		
		
	}
	public abstract void setRate();
	
	//Account ID creation method set as final because ID must not be changed during other processes 
	final String setAccountID () {
		
		String lastTwoOfTCKN = TCKN.substring(TCKN.length()-2 , TCKN.length());
		int uniqueID = index;
		int rand =(int) (Math.random()*Math.pow(10,3));
					
		return lastTwoOfTCKN + uniqueID + rand;
	}

	//Comment Methods for checking account and saving account
	
	public void deposit (double amount) {
		balanceAmt = balanceAmt + amount;
		System.out.println("Deposit amountt : " + amount + " to " + acctNumber);
		showBalanceAmt();
	}
	
	public void withdraw(double amount) {
		balanceAmt = balanceAmt - amount;
		System.out.println("Withdraw amountt : " + amount + " from " + acctNumber);
		showBalanceAmt();
	}
	
	public void transfer(Account fromAcct , Account toAcct , double amount) {
		//Sending amount from fromAcct objects balance to toAcct objects balance 
		System.out.println(amount +" transfered from " + fromAcct.getAcctNumber() + " to " + toAcct.getAcctNumber());
		fromAcct.withdraw(amount);
		toAcct.deposit(amount);
	}
	
	protected String getAcctNumber() {
		return acctNumber;
	}
	
	public void compound() {
		double acctInterest = balanceAmt * (rate / 365);
		balanceAmt = balanceAmt + acctInterest;
		System.out.println("Accepted Interest : $" + acctInterest);
	}
	
	public void showBalanceAmt() {
		//Keeing balance check
		System.out.println("Balance of Account ID : " + getAcctNumber() + " " + balanceAmt);
	}
	
	public void showInfo() {
		//Account General Info
		System.out.println("Name : " + name + "\n Account ID : " + acctNumber 
				+"\n Account Type : " + acctType + "\n Balance : " + balanceAmt);

		System.out.println(" " + acctType + " Interest Rate : " + rate + "%");
	}
}
