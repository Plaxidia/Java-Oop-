package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class PhonenumberApp {

	public static void main(String[] args)  {
		///read a text file and retrive  the phone number
		String filename="/Users/Plaxidia/Desktop/Phonenumber.txt";
		String [] Phonenumbers = new String [9];
	     String Phonenumber = " ";
		File file= new File (filename);
		try {
			BufferedReader Br  =new BufferedReader (new FileReader(file));		
	for (int i =0;i<Phonenumbers.length;i++) {
		
			 Phonenumbers[i] = Br.readLine();
	}
			Br.close();
	
		} catch (FileNotFoundException e) {
			System.out.println("Error file not found " + filename)	;
			e.printStackTrace();
		} catch (IOException e) {
		System.out.println("Error : could not read the file :"+ filename);
			e.printStackTrace();
		}
		
		//System.out.println(Phonenumber.substring(0, 1));
//for (int i =0;i<Phonenumbers.length;i++) {
	//Phonenumber =Phonenumbers[i];
		try {
			if (Phonenumber.length () !=10) {
				throw  new TenDigitsException (Phonenumber);
			}if ((Phonenumber.substring(0, 1).equals("0 " ))|| (Phonenumber.substring(0, 1).equals("9") )) {
				
				throw new AreaCodeException(Phonenumber);
			}for (int n = 0;n < Phonenumber.length () -2;n++) { 
				if (Phonenumber.substring(n, (n+1)).equals("9")) {
				if ( Phonenumber.substring(n+1, (n+3)).equals("11")) {
					throw new EmergencyExcepton(Phonenumber );
				}
			}
		}
		System.out.println(Phonenumber);
		} catch(TenDigitsException e) {
			System.out.println("ERROR: The phone number is not 10 digits :");
		System.out.println(e.toString());
		}catch (AreaCodeException e) {
			System.out.println("ERROR: The phone number has invalid area code");
			System.out.println(e.toString());
		}
		//System.out.println("Finished reading the file" +filename);
 catch (EmergencyExcepton e) {
			System.out.println("INVALID: 911  sequence found");
			e.printStackTrace();
		}
	}
}
class TenDigitsException extends Exception{
	
	String number;
	 TenDigitsException(String number){
		 this.number = number;
	 }
	 public String toString () {
		return (" TenDigitsException" + number); 
	 }
}
class AreaCodeException  extends Exception{
	String number;
	
	AreaCodeException (String number){
		 this.number = number;
	 }
	 public String toString () {
		return (" AreaCodeException :" + number);
	 }
}
class EmergencyExcepton  extends Exception{
	
String number;
	
EmergencyExcepton (String number){
		 this.number = number;
	 }
	 public String toString () {
		return (" EmergencyExcepton:" + number);
	 }
}

//}



//valiad phone number 
		// should have 10 digits long 
		//there is no 911
		// area code can not start with 0 or 9
		
		// there can no be 911 in the phone number 


