package com.kpmg.basics;

public class Methods_Ex {
	int x = 222;
	int y = 333;

	public static int addOfTwo(int a, int b) {
		return a + b;
	}

	void subOfTwo(int a, int b) {
		System.out.println("sub of two numbers :" + (a - b));
	}

	public int mulOfTwo() {
		return x * y;
	}

	public void divOfTwo() {
		System.out.println("div of two numbers :" + x / y);
	}

	public static void main(String[] args) {
		System.out.println(Methods_Ex.addOfTwo(12, 13));
		Methods_Ex obj = new Methods_Ex();
		obj.subOfTwo(23, 13);
		System.out.println(obj.mulOfTwo());
		obj.divOfTwo();
	}

}
