package com.string.manipulation;
import java.util.Scanner;
public class PCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    String input=sc.next();
		    if(input.equals("PCM")||input.equals("CMP")||input.equals("MPC")||input.equals("PMC")||input.equals("CPM")||input.equals("MCP"))
                System.out.println("YES");		    
		
		else
	System.out.println("NO");
	t--;
	}

	}

}
