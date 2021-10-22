package Oop;
class Person {
	String name ;
	String email ;
	String phone ;
	
	void walk () {
		
		System.out.println(name+ "is walking  ");
	}
	void eat() {
		System.out.println(name + "is eating");
	}
	void sleep() {
		System.out.println(name + "is sleeping ");
	}
}
	
public class Demo {

	public static void main(String[] args) {
		//instantiation an object 
		Person person1 = new Person ();
		//define some properties 
		person1.name ="john";
		person1.email ="joe@testemail.com";
		person1.phone ="0865462341";
		
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		Person person2 = new Person ();
		
		person2.name ="evan";
		person2.email ="evan@testemail.com";
		person2.phone ="24647544323";
		
		person2.walk();
		person2.eat();
		person2.sleep();
		
		
		/*
		//person
		// attributes ,variable,adjectives ,descriptors
		String name = "joe";
		String email ="joe@testemail.com";
		String phone ="0865462341";
		
		//Ations,activity,behaviour
		
		
		walking(name);
		//System.out.println(name + "is walking ");
		System.out.println(name + "is eating");
		// for another person 
		
		String name2 = "Darien";
		String email2 ="Darien@testemail.com";
		String phone2 ="0364738965";
		//Ations,activity,behaviour
		
		
		walking(name2);
		//System.out.println(name2 + "is walking  ");
		System.out.println(name2 + "is eating  ");
		
		
		
	}
	//what about binding the properties and the attributes together  
	
	
//enhance by adding a funtions to minimise the code 
	static void walking(String name ) {
		System.out.println(name+ "is walking  ");
		//System.out.println(name + "is eating");
	
	
	*/
		
	}
}
