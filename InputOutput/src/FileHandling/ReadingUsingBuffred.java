//bufferedReader Program
package FileHandling;

import java.io.*;

public class ReadingUsingBuffred {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			String s ;
			File fr = new File("D:\\KIRAN\\Java-Programs\\Text1.txt");
			File wr = new File("D:\\KIRAN\\Java-Programs\\Text2.txt");
		
			BufferedReader br = new BufferedReader( new FileReader(fr));
		

			BufferedWriter bw = new BufferedWriter( new FileWriter(wr));
			
			while((s=br.readLine())!=null) {
				System.out.println(s);
				bw.write(s);
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			System.out.println("not found");
		}
	}

}
