package Aggregation2;

public class Salary {
	private int pf;
	private int health;
	private int sales_tax;
	private int gst;
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getSales_tax() {
		return sales_tax;
	}
	public void setSales_tax(int sales_tax) {
		this.sales_tax = sales_tax;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	@Override
	public String toString() {
		return "Salary [pf=" + pf + ", health=" + health + ", sales_tax=" + sales_tax+ 
				" gst ="+gst+"]";
	}

}
