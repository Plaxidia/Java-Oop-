package massiejava;

public class ScalarySalculator {
	public static void main(String [] args) {
		
		//declare a variable
		String carrier;
		
		System.out.println("the programme is starting");
		//lets create our variable to define our carrier
		carrier = "software developer";
		System.out.println("my carrier is  "+carrier);
		//compute our annual salary
		
		//declare a variable
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate =42.50;
		//compute our annual salary
		double salary = hoursperweek * weeksperyear * rate;
		
		System.out.println("my salary is" + carrier +"at the rate of $ salary "+ rate + "  per hour is $ " + salary );
		//rate * hour/ week *weeks/year
	}

}
