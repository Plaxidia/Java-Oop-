package Oop;

public class LoanAccount implements IRate  {

	@Override
	public void setRate() {
		  System.out.println("Rate ");
	}

	@Override
	public void setincreaseRate() {
		System.out.println("increase rate ");
	}

		
	public void setTerms(int terms) {
		System.out.println("setting the term to :" + terms + "years .");
	}
    public  void setAmmortionschedule() {
	System.out.println( "Ammortion schedule :");
}
}
