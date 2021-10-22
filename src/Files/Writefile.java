package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Writefile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String fileContent = " ";
String filename ="/Users/Plaxidia/Desktop/writefilestext.txt";
File file = new File (filename);
try {
	

FileWriter writer = new FileWriter(filename) ;
writer.write(fileContent);
writer.close();
}catch(IOException e) { 
	System.out.println("Error :Could not write the data : " +filename);
	e.printStackTrace();
}finally {
	System.out.println("Closing the file writer :" +filename);
}

	}

}
