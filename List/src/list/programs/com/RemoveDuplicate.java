package list.programs.com;

//Remove duplicates elements from a string of a specified char
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	String print(String str, char ch) {
		String newStr = "";
		for (Character c : str.toCharArray()) {
			if (c.charValue()!=ch)//comparing value
				newStr += c.toString();
		}

		return newStr;
	}

}

public class RemoveDuplicate {

	public static void main(String[] args) {
		Main s = new Main();
		System.out.println(s.print("aabbcca", 'a'));

	}

}
