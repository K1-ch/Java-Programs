//Program to use list ..
package collection.programs.com;
import java.util.ArrayList;
import java.util.List;
public class Listing {

	public static void main(String[] args) {
		List<Integer> a=new  ArrayList<>();
		a.add(5);
		a.add(9);
		a.add(7);
		a.add(67);
		System.out.println(a);
		for(int x1:a)//printing the list of values with for each loop
			System.out.println(x1);
		
		
	}

}
