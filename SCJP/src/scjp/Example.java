package scjp;
//var is public static final
//method is public abstract
interface  b{
public abstract   void go();
	void m();//by defalut public abstract
//static final public int m=10;
//public int x = 1; // Looks non-static and non-final,
////but isn't!
//int x = 1; // Looks default, non-final,
////non-static, but isn't!
//static int x = 1; // Doesn't show final or public
//final int x = 1; // Doesn't show static or public
//public static int x = 1; // Doesn't show final
//public final int x = 1; // Doesn't show static
//static final int x = 1 // Doesn't show public
//public static final int x = 1; // what you get implicitly
}
class Hello implements  b{

	@Override  //always public 
	public void go() {
		
		System.out.println("Hello");
	 }

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}
	}
public class Example {

	public static void main(String[] args) {
		Hello p=new Hello();
		p.go();

	}

}
