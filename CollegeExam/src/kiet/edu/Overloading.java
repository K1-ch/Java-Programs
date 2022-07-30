package kiet.edu;

//overloading is having method with diff arguments types
//it is also called as complie tym or static polymorphism or early data binding
class Overload {
	int  sum(int a, int b) {
		return (a + b);
	}

	String  sum(String a, String b) {
		return (a + b);
	}

	double sum(double a, double b) {
		return (a + b);
	}}

public class Overloading{
	public static void main(String[] args) {
		Overload t = new Overload();
		System.out.println(t.sum(10, 20));//
		System.out.println(t.sum("Radhe", "Shyam"));
		System.out.println(t.sum(56.89, 20.03456));
	}
}
