package Oop;

public class AccountApp {

	public static void main(String[] args) {
		
		LoanAccount la = new LoanAccount ();
		la.setincreaseRate();
		la.setRate();
		la.setAmmortionschedule();
		 la.setTerms(20);
		 
		 //polymophysim ...changes where we are pointing 
		 IRate account1= new LoanAccount();
		 account1.setincreaseRate();
		 account1.setRate();
	}

}
