package FileHandling;

import java.io.*;

public class CharacterReader {

	public static void main(String[] args) throws IOException {
		int c = 0;
		try {
			File fr = new File("D:\\KIRAN\\Java-Programs\\Text1.txt");
			File wr = new File("D:\\KIRAN\\Java-Programs\\Text2.txt");
			FileReader frr = new FileReader(fr);
			FileWriter wrr = new FileWriter(wr);
			while ((c = frr.read()) != -1) {
				System.out.print((char) c);
				wrr.write(c);
			}
			frr.close();
			wrr.close();

		} catch (Exception e) {
			System.out.println("File not find");
		}

		/*
		 * FileInputStream frr = new FileInputStream(fr); 
		 * FileOutputStream wrr =new FileOutputStream(wr);
		 */
		// This is bytestream stream

	}
}
