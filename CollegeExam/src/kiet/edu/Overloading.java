package kiet.edu;

//overloading is having method with diff arguments types
//it is also called as complie tym or static polymorphism or early data binding
class Overload {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(String a, String b) {
		System.out.println(a + b);
	}

	void sum(double a, double b) {
		System.out.println(a + b);
	}}

public class Overloading{
	public static void main(String[] args) {
		Overload t = new Overload();
		t.sum(10, 20);//
		t.sum("Radhe", "Shyam");
		t.sum(56.89, 20.03456);
	}
}
