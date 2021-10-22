package Oop;

public class CDAccount extends BankAccount implements IRate   {
      String intrestrates;
String accountType;
      void compound() {
    	  System.out.println("Compounding intrest");
      }
}