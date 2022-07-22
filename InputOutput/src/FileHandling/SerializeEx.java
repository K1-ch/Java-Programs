package FileHandling;

import java.io.*;

public class SerializeEx {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			String s = new String("Important");

			FileOutputStream sr = new FileOutputStream("D:\\KIRAN\\Java-Programs\\Text1.txt.ser");
			ObjectOutputStream out = new ObjectOutputStream(sr);
			out.writeObject(s);
			out.flush();
		} catch (Exception e) {
			System.out.println("Not found");
		}
	}

}
