package backacctapp;

public class Checking extends Account{
	//List properties specific to saving account 
	private int debitCardID;
	private int debitCardKey;
	
	//Constructor to initialize saving account properties
	public Checking(String name,String TCKN,double balanceAmt) {
		
		super(name,TCKN,balanceAmt);
		acctNumber = "2" + acctNumber;
		acctType = "Checking";
		setDepositDebitCard();
		
	}
	//List methods specific to saving account 
	public void showInfo() {

		super.showInfo();
		System.out.println(" Debit Card ID :" + debitCardID);
		System.out.println(" Debit Card Key :" + debitCardKey);
	}
	private void setDepositDebitCard() {
		
		debitCardID =(int) (Math.random()* Math.pow(10, 12));
		debitCardKey =(int) (Math.random()* Math.pow(10, 4));
	}
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;	
		
	}

}
