package Oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
	  // Creating new bank account >>think instatiate an object 
   BankAccount acc1 =new BankAccount();
   acc1.accountNumber = "0308395034";
         
      // with encapsulation 
   
   
   acc1.setName("kaylee nelie ");
   acc1.setSsn("276236582");
 
   System.out.println(acc1.getname());
   System.out.println("ssn :" + acc1.getSsn());
   acc1.balance =10000;
  
   acc1.setRate();
   acc1.setincreaseRate();
   

   //polymophysim through overriding 
   System.out.println(acc1.toString());
   
  //polymophysim  through overloading 
   BankAccount acc2 =new BankAccount("checking account ");
   acc2.accountNumber ="0308395034";

   BankAccount acc3 =new BankAccount(" savings account ",5000 );
   acc3.accountNumber="0308395034";
  

}

}


/*

// acc1.name = "kaylee nelie";


// with encapsulation 


acc1.setName("kaylee nelie ");
acc1.setSsn("276236582");

System.out.println(acc1.getname());
System.out.println("ssn :" + acc1.getSsn());
acc1.balance =10000;

acc1.setRate();
acc1.setincreaseRate();

// acc1.deposite(1500);
// acc1.deposite(1500);
// acc1.deposite(1500);
// acc1.Withdraw(2000);


/*BankAccount acc2 =new BankAccount("checking account ");
acc2.accountNumber ="0308395034";

BankAccount acc3 =new BankAccount(" savings account ",5000 );
acc3.accountNumber="0308395034";
acc3.checkbalance();

//System.out.println(acc1.routingnumber);
//System.out.println(acc2.routingnumber);
//System.out.println(acc3.routingnumber);

//Demo for inheritance 
CDAccount cd1 = new CDAccount ();
cd1.intrestrates = "4,5";
cd1.balance = 3000;
cd1.name = "Evan";
cd1.accountType = " CDAccount";
System.out.println(cd1.toString());
cd1.compound();*/
