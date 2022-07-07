package backacctapp;

public abstract class Account implements InterestBaseRate {
	
	//Comment Properties for checking account and saving account
	private String name;
	private String TCKN;
	private double balanceAmt;
	
	protected String acctType = null;
	static int index= 10000;
	private double rate;
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
		
	}
	public abstract void setRate();
	
	private String setAccountID () {
			String lastTwoOfTCKN = TCKN.substring(TCKN.length()-2 , TCKN.length());
			int uniqueID = index;
			int rand =(int) (Math.random()*Math.pow(10,3));
					
		return lastTwoOfTCKN + uniqueID + rand;
	}

	//Comment Methods for checking account and saving account
	
	public void showInfo() {
		System.out.println("Name : " + name + "\n Account ID : " + acctNumber 
				+"\n Account Type : " + acctType + "\n Balance : " + balanceAmt);
		
	}
}
