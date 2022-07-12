package kiet.edu;

//import static java.lang.Math.*;
import program.*;

 class Average{
	 int avr(int res) {
		 return res/2;
	 }
 }
public class Start1{

	public static void main(String[] args) {
		int result;
		Sum s=new Sum();
		result=s.add(10,20);
		Average s1=new Average();
		System.out.println("Average of two number is "+s1.avr(result));
		System.out.println(Math.sqrt(100));
	}

}
