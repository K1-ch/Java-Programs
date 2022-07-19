package ExceptionHandle;
//InterThread communication
class Money{
	int amount=10000;
	synchronized void withdraw(int amount) {
		if(this.amount<amount) {
			System.out.println("Less amt waiting for depsoit");
			try {
				wait();
			}catch(Exception e) {}
		}
		this.amount-=amount;
		System.out.println("completed withdraw");
	}
	synchronized void deposit(int amount) {
		System.out.println("money depsoited");
		this.amount+=amount;
		notify();
	}
}

public class Test{
	public static void main(String [] args) {
		Money s=new Money();
		new Thread() {
			public void run() {
				s.withdraw(20000);
			}
		}.start();
		new Thread() {
			public void run() {
				s.deposit(10000);
			}
		}.start();
	}
}