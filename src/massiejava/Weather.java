package massiejava;

public class Weather {
	public static void main(String[] args ) {
		//this program will give the suggestion of what to wear based on the weather(temperature and sun condition)
		int temp =45;
		String Suncondition = "Overcaust";
		if (temp > 80) {
			System.out.println("its pleasent wear shorts and t-shirts ");
			
		}
		else if (temp >60 &&  Suncondition == "Sunny") {
			System.out.println("its a bit cooler perharps wear a long sleeved shirt");
			System.out.println(" keep the sun out of your eyes");
		}
		else if (temp >50 || Suncondition == "Overcaust") {
			System.out.println(" its a bit cool you can wear the sweat pants");
		    System.out.println(" your eyes are safe no need for sunglasses");
		}
		else if (temp >40 || Suncondition == "Sunny") {
			System.out.println(" its a bit cool you can wear warm clothes");
		    System.out.println(" don't wear sunglasses");
		}
		
		else {
			System.out.println(" it looks like its a cold day bring a jacket");
		}
		System.out.println("the program is ending");
	}

}
