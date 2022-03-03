package com.inheritance.example;
public class Potato extends Crops {
private int seed_rate;

public int getSeed_rate() {
	return seed_rate;
}

public void setSeed_rate(int seed_rate) {
	this.seed_rate = seed_rate;
}


@Override
public String rank_state() {
	return "The rank_state is one";
}

}
