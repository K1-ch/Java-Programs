package kiet.edu;

class Overloaded {
	String color;

	Overloaded(String c) {
		color = c;
	}

	Overloaded() {
		color = null;
	}

	String show() {
		return color;
	}

	String display() {
		return color;
	}
}

public class OverloadCons {

	public static void main(String[] args) {
		Overloaded s = new Overloaded();
		Overloaded s1 = new Overloaded("White");
		System.out.println(s1.color);
		System.out.println(s.color);
	}

}
