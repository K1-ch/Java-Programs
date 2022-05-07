package com.milk.products;

public class Rasgulla extends Milk {
private int dryFruits;
private int flour;
public int getDryFruits() {
	return dryFruits;
}
public void setDryFruits(int dryFruits) {
	this.dryFruits = dryFruits;
}
public int getFlour() {
	return flour;
}
public void setFlour(int flour) {
	this.flour = flour;
}
@Override
public String sugar() {
	// TODO Auto-generated method stub
	return "1kg";
}



}
