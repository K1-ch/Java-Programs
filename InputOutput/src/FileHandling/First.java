package FileHandling;

//Importing input output classes
import java.io.*;
//Java Program to illustrate Reading from FileReader
//using BufferedReader Class means line by line 

public class First {

	public static void main(String[] args) throws IOException {

		File file = new File("D://KIRAN//program.txt");

		// Creating an object of BufferedReader class
		BufferedReader br = new BufferedReader(new FileReader(file));
		// readLine() Reads line by line
		String st;
		// Condition holds true till
		// there is character in a string
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
	}

}
