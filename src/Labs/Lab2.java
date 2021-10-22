package Labs;

public class Lab2 {

	public static void main(String[] args) {
		// create a student 
		student st1 = new student  ("Kaylee ","102019281");
		//student st2 = new student  ("Devan","084897210");
		//student st3 = new student  ("Evan","040309165");
		
		st1.enroll( "math151");
		st1.enroll( "english151");
		st1.enroll( "c++001");
		st1.checkbalance();
		st1.pay(600);
		//st1.checkbalance();
		//st1.showCourses();
		st1.setphone("+26311098");
		System.out.println("Phone :" + st1.getphone());
		st1.setcities("Moscow ");
		System.out.println("cities:" + st1.getcities());
		st1.setstate("priosky");
		System.out.println("State :" + st1.getstate());
		System.out.println(st1.toString());
	}

}
class student {
	// prpperties 
	private static int ID = 0;
	private String  userID;
	private String name;
	private  String ssn;
	private String email ;
	private String phone;
	private	String city;
	private String state;
	
	private String courses ="";
	private static final int costofcourse = 800;
	private int  balance  =0;
	
	
	public student (String name ,String ssn) {
		System.out.println(" NEW  STUDENT ACCOUNT CREATED :");
		ID++;
		this.name =name;
		this.ssn =ssn;
		setemail();
		setuserID();
	}public void  setphone(String Phone ) {
		this.phone= Phone;
	}
	public  String getphone() {
		return phone;
	}
	public void setcities(String cities) {
		this.city= cities;
	}
	public String getcities () {
		return city;
	}
	public void setstate(String states) {
		this.state=states;
	}
	
	public String  getstate() {
		return state;
	}
	
	private  void setemail () {
		email =name.toLowerCase()+"."+ID+"@Moropane.com" ;
		System.out.println("Your email :" + email);
	}
	public String  getemail() {
	return 	email;
	}
	private void setuserID( ) {
		int max =9000;
		int min = 1000;
    int  randnum = (int)(Math.random ()* (max - min));
    randnum = randnum + min;
    
	//System.out.print(randnum);
    userID = ID +""+randnum  + ssn.substring(2);
    		
    System.out.println("Your userID :"+ userID);
	}
	public void  enroll (String Course ) {
		this.courses = this.courses +" ,"+ Course;
		balance = balance + costofcourse;
	}
	public void pay(int amount ) {
		
		System.out.println("Payment $:" + amount  );
		balance = balance-amount;
	}
	public void checkbalance () {
		System.out.print("Balance : $ " + balance );
	}
	public  void showCourses () {
		System.out.println(courses);
	}
	public String  toString () {
		return  "[name;"+name +"]\n[courses:"+courses +"]\n[balance:" +balance +"]" ; 
		
	}
}