package multithreading;

class Example extends Thread {
	int i=1;
	void show() throws InterruptedException{
		while( i<=5) {
		System.out.println("Hii");
		Thread.sleep(1000);
		i++;
		}
	}

}
class Example1  extends Thread{
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
			s.start();
			s.show();
			t.start();
			t.show();
	}

}
