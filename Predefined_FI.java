package com.kpmg.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predefined_FI {

	public static void main(String[] args) {
		Predicate<Integer> predicate = a -> a % 2 == 0;

		System.out.println(predicate.test(12));
		Predicate<String> predicate1 = a -> a.length() > 6;

		System.out.println(predicate1.test("KPMG"));

		Function<Integer, Integer> function = a -> a * a;

		System.out.println(function.apply(12));

		Consumer<String> consumer = name -> System.out.println(name.toUpperCase());
		consumer.accept("sss");

		Supplier<String> supplier = () -> "welcome to java 8 features";

		System.out.println(supplier.get());

	}

}
