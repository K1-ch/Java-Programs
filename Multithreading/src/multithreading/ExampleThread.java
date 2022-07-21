package multithreading;
//creating multiple thread using interface runnable
class ThExample1 implements Runnable {

	@Override
	public void run() {
		int i=1;
		while(i>2) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			i++;
		}
		
	}
	
}
class ThExample2 implements Runnable{

	@Override
	public void run() {
		int i=1;
		while(i<=2) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			i++;
		}
		
	}
	
}
public class ExampleThread {

	public static void main(String[] args) {
		ThExample1 s=new ThExample1();
		ThExample2 t=new ThExample2();
		s.run();
		t.run();
	}

}
