package com.fun.programs;

class Team {
	public void  isPossible(int n) {
		int a[]=new int[100];
		a[0]=1;
       for(int i=2;i<=n;i++) {
    	   if(n%i==0)
    		 a[i]=i;  
       }
     for(int i=0;i<a.length;i++)
    	 System.out.println(a[i]);
	}
	
}

public class NinjaTeam {

	public static void main(String[] args) {
		Team s = new Team();
		s.isPossible(19);

	}

}
