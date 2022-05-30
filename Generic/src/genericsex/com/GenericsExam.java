package genericsex.com;

class Test1<T, U> {
	T obj1;
	U obj2;

	Test1(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public T getObj1() {
		return obj1;
	}
	public U getObj2() {
		return obj2;
	}

}

public class GenericsExam {

	public static void main(String[] args) {
    Test1<Integer,String> s=new Test1<>(1,"Kiran");
    
    System.out.println(s.getObj1());
    System.out.println(s.getObj2());
    
	}

}
