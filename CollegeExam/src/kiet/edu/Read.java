package kiet.edu;

import java.io.*;

public class Read {

	public static void main(String[] args) throws IOException {
		int c=0;
	File fr=new File("D:\\KIRAN\\Java-Programs\\emp.txt");
	FileReader frr=new FileReader(fr);
	while ((c = frr.read()) != -1) {
		System.out.print((char) c);
			}
	frr.close();
	}

}
