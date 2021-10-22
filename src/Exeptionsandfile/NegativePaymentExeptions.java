package Exeptionsandfile;

public class NegativePaymentExeptions  extends Exception{
	// class variable 
	
	double payment ;
	//1 constructor that takes the value that throw the exception
	//2 assign value of the local class variable 
public   NegativePaymentExeptions(double payment ) {
	this.payment= payment ;
	//ystem.out.println("ERROE: Negative payments");
}
//override the tostring () method to include the specific execution method
public String toString () {
	return "ERROR : can not take the nagative payment :"  +  payment ;
}
}
