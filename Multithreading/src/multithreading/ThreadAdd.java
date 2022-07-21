package multithreading;

//multithreading using thread class
class A implements Runnable {
	Thread t;

	A(String s) {
		t=new Thread(this,s);
		t.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

public class ThreadAdd {
	public static void main(String[] args) {
		A s = new A("Thread 1");
		A s1 = new A("Thread 2");
	}
}