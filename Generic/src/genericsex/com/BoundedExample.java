package genericsex.com;

class Bound<T extends A> {
	T objf;

	Bound(T obj) {
		this.objf = obj;
	}

	void display() {
		this.objf.show();
	}
}

class A {
	void show() {
		System.out.println("Hello");
	}
}

class B extends A {
	void show() {
		System.out.println("hii");
	}
}

class C extends B {
	void show() {
		System.out.println("namaste");
	}
}

class M{
	void show() {
		System.out.println("no");
	}
}
public class BoundedExample {

	public static void main(String[] args) {

		Bound<A> s = new Bound<A>(new A());
		s.display();
		Bound<B> s1 = new Bound<B>(new B());
		s1.display();
		Bound<C> s2 = new Bound<C>(new C());
		s2.display();

		/*
		 * Bound<M> s3 = new Bound<M>(new M()); s3.getMessage(); Bound mismatch: The
		 * type M is not a valid substitute for the bounded parameter <T extends A> of
		 * the type Bound<T>
		 */

	}

}
