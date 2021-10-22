package Labs;

public class BankAccountAppPractical {

	public static void main(String[] args) {
	BankAccount acc1 = new BankAccount("333224444",1000);
	BankAccount acc2 = new BankAccount("111008888",2000);
	BankAccount acc3 = new BankAccount("2229955555",2500);
	
	acc1.setName("kaylee mm");
	System.out.println(acc1.getName() );
	acc1.makeDeposit(500);
	acc1.makeDeposit(600);
	acc1.payBill(1000);
	acc1.accrue();
	System.out.println(acc1.toString());
	}

}
class BankAccount implements IIntrest {
	
	//properties of bank account number
	private static  int  ID = 10000;          
	private String accountnumber;
	private static final String  routingnumber = "35329328";
	private String name;
	private String ssn;
	private double balance ;
	
	//constroctors 
	
	public BankAccount (String ssn,double intdeposit) {
		System.out.println(" NEW ACCOUNT CREATED :");
		this.ssn=ssn;
		ID++;
		balance =intdeposit;
		//System.out.println(ID);
		setaccountnumber();
	}
	private  void setaccountnumber() {
		int random = ( int ) (Math.random() * 1000);
		accountnumber =ID + " " + random + ssn.substring(0,1);
		System.out.println("Your Account number :" + accountnumber );
	}
	
	public void setName (String name ) {
		this.name  =name ;
	}
	public String getName() {
		return name ;
	}
	public void payBill(double amount ) {
		balance = balance - amount ;
		System.out.println("paying bills :" + amount );
		showBalance();
	}
	public void makeDeposit(double amount ) {
		balance = balance + amount ;
		System.out.println("making a deposit :" + amount);
		showBalance();
	}
	public void showBalance () {
		System.out.println("Your balance : " + balance );
	} 
	public void accrueintrest() {
		
	}
	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance *(1+rate/100);
		
		showBalance();
	}
	@Override
	public String toString () {
		return "[name :" + name +"]\n[ acccount number ;" + accountnumber + "]\n"+ "[Routing number :" +  routingnumber +"]\n" + "balance :"+ balance + "]";
	}
}



// internal ID...of how we will identify the customers internally ...customers will have their own 
	//ID + random 2 digit number + first 2 of ssn.
	