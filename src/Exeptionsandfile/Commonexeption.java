package Exeptionsandfile;

public class Commonexeption {

	public static void main(String[] args) {
		
int a=5;
int b= 0;

// identify the potential problem error
//surrond with try and catch block
    try {
     int c =a/b;

    }catch(ArithmeticException e) {
    	System.out.println("can not devide by zero");
    	System.out.println(e.toString());
    }
    System.out.println("program is closing ");
String [] states = {"CA","Ta","FL","MA"};
 for (int i=0;i<states.length;i++) {
	 try {
		 
	 System.out.println(states[i]);
	 }catch( ArrayIndexOutOfBoundsException e) {
		 System.out.println("index outside of array domian");
		 System.out.println(e.toString());
	 
	 }
	 finally {	 
	 //System.out.println("iliterating through the arrary");
 }
 System.out.println("program is closing ");
	}
	}

}
