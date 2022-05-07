package collection.programs.com;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class ArrayListWrapper {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		Integer[] intarr = a.toArray(new Integer[a.size()]);
		a.add(1);
		a.add(2);
		a.add(6);
		a.add(5);
		System.out.println(a);
		a.remove(new Integer("6"));
		System.out.println(a);
		Iterator<Integer> itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (Integer i : a) {
			System.out.println(i);
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}
