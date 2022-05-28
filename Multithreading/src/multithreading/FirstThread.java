package multithreading;

class Example {
	int i=1;
	void show() throws InterruptedException{
		while( i<=5) {
		System.out.println("Hii");
		Thread.sleep(1000);
		i++;
		}
	}

}
class Example1 {
	int i=1;
	void show() throws InterruptedException{
		while(i<=5) {
		System.out.println("Hello");
		Thread.sleep(1000);
		i++;
		}
	}

}
public class FirstThread {

	public static void main(String[] args) throws InterruptedException {
		Example s=new Example();
		Example1 t=new Example1();
		Thread t1=new Thread();
		Thread t2=new Thread();
	t1.start();
	t2.start();
	s.show();
	t.show();
	}

}
