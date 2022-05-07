package com.array.format;
import java.util.*;
public class Intersection {
	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		String m[] = input.split(" ");// input string
		int n=sc.nextInt();
		int count=0;
		for (int i = 0; i < m.length; i++) {			    {
			if (Integer.parseInt(m[i])==n)  
			      {
			        for(int j = i; j < m.length - 1; j++)
			        {
			            m[j] = m[j+1];
			        }
			        break;
							}
		}
		count++;
		}
		for(int i = 0; i < m.length-count; i++)
	       {
	             System.out.print(m[i]+ " ");
	       }  

	}
}
