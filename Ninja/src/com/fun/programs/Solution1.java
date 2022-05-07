package com.fun.programs;
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Shape{
    int length,breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	void area(){
        System.out.println(length+" "+breadth);
       
    }
    
}
class Rectangle extends Shape{
	
    void area() {
    	System.out.println(length*breadth);
    }
}
public class Solution1{
    public static void main(String args[] ) throws Exception {
    	Shape m=new Shape();
       
        m.length=4;
        m.breadth=5;
        m.area();
       
    }
}