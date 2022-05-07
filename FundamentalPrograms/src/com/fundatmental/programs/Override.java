package com.fundatmental.programs;
import java.util.Scanner;
public class Override {
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public static void main(String[] args) {
		int T;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		while(T!=0) {
			int NumDays,Cost,total=0;
			NumDays=sc.nextInt();
			Cost=sc.nextInt();
			int rain[]=new int[NumDays];
			for(int i=0;i<NumDays;i++) {
				rain[i]=sc.nextInt();
			}
			for(int i=0;i<NumDays;i++) {
				 if(NumDays>1)
				 if(rain[i]==1 || rain[i-1]==1)
					total+=Cost;
				 if(NumDays==1) {
					 if(rain[0]==1) {
						 total+=Cost;
					 }
				 }
					
			}System.out.println(total);
                  T--;
					}

	}

}
