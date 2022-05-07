package com.array.format;
import java.util.*;
public class Compare2Arr {
	public static void main(String[] args) {
		String input = "";
		String input1 = "";
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		input1 = sc.nextLine();
		String temp,temp1;
		String n[] = input.split(" ");// input string1
		String m[] = input1.split(" ");// input string2
		for (int i = 0; i < n.length; i++) {
			for (int j = i; j < n.length; j++) {
				if (Integer.parseInt(n[i]) > Integer.parseInt(n[j])) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;	
				}
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = i; j < m.length; j++) {
				if (Integer.parseInt(m[i]) > Integer.parseInt(m[j])) {
					temp1 = m[i];
					m[i] = m[j];
					m[j] = temp1;	
				}
			}
		}		
		for (int i = 0; i < n.length; i++) {
		if(m[i]==n[i])
			System.out.println(1);
			}
	}

}
