//Reverse String By String Buffer
package list.programs.com;

import java.util.*;

import java.util.List;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		StringBuffer m = sb.reverse();

		System.out.println(m.toString());

	}

}
