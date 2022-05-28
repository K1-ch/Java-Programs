package FileHandling;
import java.io.*;
//read a file content and copy it to another file
public class CharByChar {

	public static void main(String[] args) throws IOException {
		File fr=new File("D:\\KIRAN\\Sum.java");
		File wr=new File("D:\\KIRAN\\SumCopy.java");
		FileReader frr=new FileReader(fr);
		FileWriter fwr=new FileWriter(wr);
		int c=0;
		while((c=frr.read())!=-1) {
			fwr.write(c);
			System.out.print((char)c);
		}
		
	}

}