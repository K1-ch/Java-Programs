package collectionsProgramKiet;

import java.util.ArrayList;
import java.util.Iterator;
//collection is an interface
//set queue and list are three different collections
//Array is static and list is dynamic
//list  is implemented by vector , 

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Kiet");
		names.add("akge");
		names.add("abs");
	   //iterator
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		
		names.remove(1);
		for(String s:names) {
			System.out.println(s);
		}
		
		
	}

}
//what is the diff btwn arraylist and vector?
//list is an interface it is having some methods inside it 
//methods inside vector are synchornized the provide thread safety
//synchornized 
