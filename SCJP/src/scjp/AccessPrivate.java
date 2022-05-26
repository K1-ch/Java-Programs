package scjp;
//program to accesss private method from outside the class

import java.lang.reflect.Method;

class Main{
	private int sum(int a,int b) {
		return a+b;
	}
	
	
}
public class AccessPrivate {
	public static void main(String[] args) throws Exception {
     Class c=Main.class;
     Object obj=c.newInstance();
     Method m=c.getDeclaredMethod("sum", new Class[] {
    		 int.class,int.class
     });
     m.setAccessible(true);
     System.out.println(m.invoke(obj,20,30));

		
	}
}
