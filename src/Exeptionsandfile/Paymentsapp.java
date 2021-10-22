package Exeptionsandfile;

import java.util.Scanner;

public class Paymentsapp {
	
	public static void main(String[] args) {
double payment=0;
boolean positivePymt =true;
		
do {
	
	System.out.print("enter the payment amount:");
	
	// 2.get the amount and test value 
	Scanner in =new Scanner(System.in);
	 
	//3. handle exeptions properly
		try {
			payment =in.nextDouble();
		if (payment<0) {
			
		//throw the error
			throw new NegativePaymentExeptions(payment  );
		}else {
			positivePymt =true;
		}
		
		}catch( NegativePaymentExeptions e){
			//exeptions 
			System.out.println( e.toString());
			System.out.println("Please try again.... !");
		    positivePymt =false;
		}
		
		
}	while (!positivePymt) ;
			
		
		//4.Print the confirmation 
System.out.println("Thank you for your payment of $" + payment);
	}

}










/*
package Exeptionsandfile;

import java.util.Scanner;

public class Paymentsapp {
	//take payments from the us
	public static void main(String[] args) {
//1. ask the user for the  input 
		double payment  =0;
		System.out.print("enter the payment amount:");
		
		// 2.get the amount and test value 
		Scanner in =new Scanner(System.in);
		 //int amount =in.nextInt();

		try {
		
		if (payment<0) {
			payment =in.nextDouble();
		//throw the error
			throw new NegativePaymentExeptions();
		}
		
		}catch( NegativePaymentExeptions e){
			//exeptions 
			System.out.println("ERROR;" + e.toString());
			
		}
		*/