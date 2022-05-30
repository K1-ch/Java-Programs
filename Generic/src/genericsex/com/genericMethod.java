package genericsex.com;

public class genericMethod  {
	
	static <T,U> void show(T obj) {
		System.out.println(obj.getClass().getName()+" "+obj);
	}
	public static void main(String[] args) {
		show(11);
		show("Anjali");
		show(10.234);
	}
}
