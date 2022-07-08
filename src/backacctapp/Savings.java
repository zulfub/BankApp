package backacctapp;

public class Savings extends Account{
	//List properties specific to saving account 
	private int safetyBoxID;
	private int safetyBoxKey;
	
	//Constructor to initialize saving account properties
	public Savings(String name, String TCKN, double depositAmt) {
		
		super(name,TCKN,depositAmt);
		acctNumber = "1" + acctNumber;
		acctType = "Saving";
		setDepositSafetyDepositBox();
		
	}

	//List methods specific to saving account 
	public void showInfo() {

		super.showInfo();
		System.out.println(" Deposit Box ID :" + safetyBoxID);
		System.out.println(" Deposit Box Key :" + safetyBoxKey);
	}
	private void setDepositSafetyDepositBox() {
		
		safetyBoxID =(int) (Math.random()* Math.pow(10, 3));
		safetyBoxKey =(int) (Math.random()* Math.pow(10, 4));
	}

	@Override
	public void setRate() {
		
		rate = getBaseRate() - .25;
	}


}
