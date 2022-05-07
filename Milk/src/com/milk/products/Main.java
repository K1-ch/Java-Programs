package com.milk.products;

public class Main {

	public static void main(String[] args) {
		Rasgulla ras=new Rasgulla();
		ras.setType_milk("cow");
		ras.setLitre(2);
		ras.setFlour(1);
		ras.setDryFruits(1);
		System.out.println(ras.getType_milk());
		System.out.println(ras.getLitre());
		System.out.println(ras.getFlour());
		System.out.println(ras.getDryFruits());
		System.out.println(ras.sugar());
      Pudding pud=new Pudding();
      pud.setType_milk("buffalo");
		pud.setLitre(2);
		System.out.println(pud.getType_milk());
		System.out.println(pud.getLitre());
		System.out.println(pud.getRice());		
		System.out.println(pud.sugar());
	}

}
