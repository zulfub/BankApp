package backacctapp;

public interface InterestBaseRate {
	
	//Write a method returns the base rate
	default double getBaseRate() {
		
		return 2.5;
	}
}
