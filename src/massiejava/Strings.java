package massiejava;

public class Strings {

	public static void main(String[] args) {
		String booktitle;
		String wordchoice = "Sheds";
		booktitle =" the lord of sheds";
		if(booktitle.contains("sheds")) {
			System.out.println("the book contains the word sheds :"+booktitle);
			
			
		}
		String browser="Chrome ";
		if(browser.equalsIgnoreCase("Chrome")) {
			
			System.out.println("the browser is chrome ");
		}
		
		String firstname ="plaxidia";
		String lastname ="hove";
		String  ssn = "5432109876";
		
		
		System.out.println("there  is "+ssn.length()+ "digits in your ssn");
		//print initials and lst four digits of ssn
		//firstname.substring(0,1);
		System.out.println(firstname.substring(0,1));
		System.out.println(lastname.substring(0,1));
		System.out.println(ssn.substring(5));
	}

}
