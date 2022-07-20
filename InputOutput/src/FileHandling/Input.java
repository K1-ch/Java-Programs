package FileHandling;

import java.io.*;

public class Input {

	public static void main(String[] args) throws IOException {
		try {
			boolean value = true;
			String temp = null;
			InputStream is = System.in;
			InputStreamReader r = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(r);
			StringBuffer sr = new StringBuffer();
			while (value) {
				br.readLine();
				if (temp == null || temp.length() == 0) {
					value = false;
				} else {
					sr.append(temp);
				}
			}
			System.out.println(" " + sr.toString());
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
