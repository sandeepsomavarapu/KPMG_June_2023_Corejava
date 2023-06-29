package com.kpmg.java8;

@FunctionalInterface
interface Calculator {
	public abstract int sub(int a, int b);
	public default void m1()
	{
		
	}
	public static void m2()
	{
		
	}
}

public class LamdaExpressionsEx implements Calculator{

	public int addOfTwo(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculator calci = (a, b) -> a - b;
		System.out.println(calci.sub(12, 2));
	}
	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
