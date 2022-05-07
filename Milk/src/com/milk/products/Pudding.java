package com.milk.products;

public class Pudding extends Milk {
private int rice;

public int getRice() {
	return rice;
}

public void setRice(int rice) {
	this.rice = rice;
}

@Override
public String sugar() {
	// TODO Auto-generated method stub
	return "2 kg sugar";
}
}
