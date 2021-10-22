package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reed {

	public static void main(String[] args)  {
		// define the file (path ) we want to read
String  filename = "/Users/Plaxidia/Desktop/readfilestext.txt";
	String text= null;	
File file = new File(filename); 

	

BufferedReader Br ;
try{
	Br =new BufferedReader (new FileReader(file));	
    text =Br.readLine();
 Br.close();
	}catch(FileNotFoundException e){
		System.out.println("Error file not found " + filename)	;
e.printStackTrace();
	}catch(IOException e) {
	System.out.println("error: could not read the data"+ filename);
	e.printStackTrace();
	}finally {
		System.out.println("finished reading the file"+ filename);
	}
System.out.println(text);
	}

	
	

} 
/*
 
File file = new file ("/Users/Plaxidia/Desktop/readfilestext.txt");
	
Scanner scan = new Scanner (file);

String  fileContent =" ";
while(scan.hasNextLine()) {
	fileContent=fileContent.concat(scan.nextLine()+ " \n");

//System.out.println(scan.nextLine());
}
FileWriter writer = new FileWriter("/Users/Plaxidia/Desktop/newfile.txt") ;


writer.write(fileContent);
writer.close();*/