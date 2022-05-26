package scjp;

enum Week {
	mon(1), tue(2), wed(3), thur(4), fri(5), sat(6), sun(7);

	private int w;

	Week(int w) {
		this.w = w;
	}

	public int getW() {
		return w;
	}
}

public class CallEnum{
	Week week_days;//each instance has an enum
	public static void main(String[] args) {
		CallEnum s=new CallEnum();
		s.week_days=Week.mon;
		System.out.println(s.week_days.getW());//access particulary
		//printing using values method
		for(Week cs: Week.values()) {
			System.out.println(cs+" "+cs.getW());
		}
			
		
	}
}
