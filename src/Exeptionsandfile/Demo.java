package Exeptionsandfile;

public class Demo {

	public static void main(String[] args) {
		 System.out.println("The program starts");
 domath(12,0);
System.out.println("The program continues");
	}
public  static void domath(int a,int b) {
	answer (a,b);
}
public static double answer(int x,int y) {
	//catch the error
	return  x/y;
	
}
}
