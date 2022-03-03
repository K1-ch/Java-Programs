package com.inheritance.example;
public class Crops{
	
	private String state;
	private String soil_type;
		public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
		public String getSoil_type() {
		return soil_type;
	}
	public void setSoil_type(String soil_type) {
		this.soil_type = soil_type;
	}
	public String rank_state() {  //behaviour
		return "rank";
	}
		

}