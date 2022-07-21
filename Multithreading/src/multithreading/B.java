package multithreading;
//using interface
class M implements Runnable{
	Thread t;
	String s;
	M(String s1){
		s=s1;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		System.out.println(s);
	}
}

public class B{
	public static void main(String[] args) {
		M s=new M("Go to hell");
	}
}