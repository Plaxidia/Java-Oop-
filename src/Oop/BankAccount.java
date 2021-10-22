package Oop;

public class BankAccount implements IRate  {

 private  static   final String routingnumber = "7237657";
	String accountNumber;
   private   String name;
   private String   ssn;
    String accounttype;
    double balance =0;
 
    BankAccount(){
    System.out.println("NEW ACCOUNT CREATED");
    }
   
    BankAccount(String accountType){
        System.out.println("NEW ACCOUNT :" + accountType);  
    }
    BankAccount(String accountType ,double intdeposit ){
    	
    	System.out.println("NEW ACCOUNT :" + accountType); 
        System.out.println("initial deposit of $ :" + intdeposit);
        String Msg=null;
        
        if(intdeposit > 5000) {
        
        	Msg = "error :the initial deposit must not be less than $1000";
        }
        else {
        	
        	Msg = "thank you for the initial deposit  of $ :" + intdeposit;
        }
        System.out.println(Msg);
          balance = balance + intdeposit;     
    }
    
    //getters and setters 
    
    // allow the user to define the name ,
    public void setName (String name) {
    	this.name = "Mrs ." + name;
    	
    }
    public String getname() {
    	return name;
    }
    public void setSsn(String Ssn) {
    	this.ssn =  Ssn;
    }
    public String getSsn() {
    	return ssn;
    }
    
    // interface methods 
    
    public void setRate() {
    System.out.println("SETTING THE RATE ");	
    }
    public void setincreaseRate() {
    	 System.out.println("INCREASING  RATE ");
    }
    
    
    
    public void deposite (double amount ) { 
    	balance =balance + amount ;
    	showActivity("deposite");
    }
    void Withdraw(double amount ) {
    	balance =balance + amount ;
    	showActivity ("Withdraw");
    }
    // PRIVATE CAN ONLY BE CALLED FROM WITHIN THE CLASS 
    private void showActivity(String activity) {
    	System.out.println("YOUR  RECENT TRANSACTION " + activity);
    	System.out.println(" YOUR BALANCE IS :" + balance );
    }
    void checkbalance () {
    //String balance  =null;
    	System.out.println("Balance is:"+ balance );
    }
    void getstatus() {
    	
    }
    @Override
   public  String toString() {
    		return "[ NAME : " + name + " .  ACCOUNT# " +  accountNumber + "ROUTING #" + routingnumber + " . BALANCE  $ " + balance  +  "]";
    	}

	

	}

	

	
	


/*
String accountNumber;
//static >>belongs to the Class not the object  instance
	// fin]al>> constant( final static {alwyas go together})


final String routingnumber = "7237657";
String name;
String ssn;//social security number
String accounttype;
double balance =0;
//constructor definations uniqe methods 
//1,used to define /setup /initialize properties of an object 
// 2, constructors are  impicitly called upon the initiation 
// 3,the same name as the class itself 
// 4,constroctors has no return type 
}
public String BankAccount;
public String accountNumber;
public char[] routingnumber;

BankAccount(){
System.out.println("NEW ACCOUNT CREATED");
}
//overloading  .....call same method name with differant aurguments 


BankAccount(String accountType){
    System.out.println("NEW ACCOUNT :" + accountType);

    
}
BankAccount(String accountType ,double intdeposit ){
    System.out.println("initial deposit of  :" + intdeposit);
    String Msg;
    
    if(intdeposit >1000) {
    
    	Msg = "the initial deposit must not be less than $1000";
    	//String errorMsg = "the initial deposit must not be less than 1000";
    	// System.out.println(errorMsg);
    	    
    }
    else {
    	Msg ="thank you for the initial deposit  of $1000:" + intdeposit;
    }
    System.out.println(Msg);
     
      double balance = intdeposit;
}



//define methods 

void deposite () { 
	
}
void Withdraw() {
	
}
void checkbalance () {
	
	String balance  =null;
	 System.out.println("Balance is:"+ balance );
}
void getstatus() {
	
}


}*/