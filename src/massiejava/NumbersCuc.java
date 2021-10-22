package massiejava;

public class NumbersCuc {
	public static void main(String[] args) {
		System.out.println("the program is starting");
		int a =10;
		int b =20;
		printname();
		AddNumbers(a,b);
		MultiplyNumbers(a,b);
		System.out.println(MultiplyNumbers(  a, b));
		
	}
	static void printname() {
		System.out.println("my name is Plaxidia ");
		
	}
	
    static void AddNumbers(int a,int  b ) {
    	int sum = a+b ;
    	 
    	System.out.println("The sum of numbers " + a + " and "  + b + "is "+ sum);
	
}
    static int MultiplyNumbers( int valuea,int valueb) {
    	int product =valuea  *  valueb;
    //	System.out.println( ""The product  of numbers " + a + " and "  + b + "is "+ MultiplyNumbers(  a, b);
    	
    	return product;
    
	
}
}
