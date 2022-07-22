package newFeaturesOfJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//functional interface is a interface 
//that has only one abstract method bt can have any num of object class methods

@FunctionalInterface
interface FunInterface {
	int withdraw(int num1, int num2);
}

public class FunctionalInterface1 {

	public static void main(String[] args) {

		FunInterface inter = (a, b) -> {
			System.out.println("A-->" + a + " B-->" + b);
			return a + b;
		};

		Supplier<Double> supp = () -> {
			return Math.random();
		};

		Consumer<Integer> cons = (a) -> {
			System.out.println("The input is-->" + a);
		};

		Predicate<Integer> pred = (a) -> {
			return a == 10;
		};
		System.out.println("The result is " + inter.withdraw(30, 20));
		System.out.println(supp.get());
		cons.accept(10);
		System.out.println(pred.test(10));

		List<Integer> lst = Arrays.asList(1, 4, 6, 7, 15, 14, 10);
		lst.stream().filter(a -> a % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
