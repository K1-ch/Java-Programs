package com.milk.products;

public class Milk {
	private String Type_milk;
	private int litre;

	public String getType_milk() {
		return Type_milk;
	}

	public void setType_milk(String type_milk) {
		Type_milk = type_milk;
	}

	public int getLitre() {
		return litre;
	}

	public void setLitre(int litre) {
		this.litre = litre;
	}

	public String sugar() {
		// TODO Auto-generated method stub
		return "1kg";
	}
}
