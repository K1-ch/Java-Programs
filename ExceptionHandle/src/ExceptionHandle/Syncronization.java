package ExceptionHandle;

class A extends Thread{
	Thread t;
	String s[]= {"this","is","a ","variable"};
	A(String s){
		super(s);
	}
	public void run() {
		display(getName());
	}
	public  void display(String string) {
		synchronized (this) {
		for(int i=0;i<=3;i++) {
			System.out.println(string + s[i]);
			try {
				this.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		}}
}
public  class Syncronization {

	public static void main(String[] args) {
		A s=new A("Thread 1");
		s.start();
		A s1=new A("Thread 2");
		s1.start();
	}

}
