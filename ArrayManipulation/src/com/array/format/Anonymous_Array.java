package com.array.format;
//Anonymns Array Use in program
class Implement{
	int sum(int x[]) {
		int total=0;
		for(int x1:x) {
			total+=x1;
		}
		return total;
	}
}

public class Anonymous_Array{
	public static void main(String[] args) {
		Implement s=new Implement();
		System.out.println(s.sum(new int[]{10,20,30,40,50}));
	}
}