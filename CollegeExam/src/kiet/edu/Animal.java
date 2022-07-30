package kiet.edu;

class AnimalName {
	int number;

	void legs() {
		System.out.println("Every animal has legs");
	}
}

class Dog extends AnimalName {
	@Override
	void legs() {
		super.number = 4;

		System.out.println("Dog has " + number + " Legs");
	}
}

public class Animal {
	public static void main(String[] args) {
		Dog s = new Dog();
		s.legs();

	}
}