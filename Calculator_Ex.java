package com.kpmg.oops;

class Pc_Caluculator {
	public void mulOfTwo(int a, int b) {
		System.out.println("mul of two numbers : " + (a * b));
	}

	public void divOfTwo(int a, int b) {
		System.out.println("div of two numbers : " + (a / b));
	}
}

class Calculator extends Pc_Caluculator {
	int result = 2345;

	public void addOfTwo(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public void subOfTwo(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));
	}
}

class MobileCalculator extends Pc_Caluculator {
	public void modOfTwo(int a, int b) {
		System.out.println("mod of two numbers : " + (a % b));
	}
}

public class Calculator_Ex {
	public static void main(String[] args) {
		MobileCalculator obj = new MobileCalculator();
		obj.modOfTwo(4, 10);
//		obj.addOfTwo(12, 13);
//		obj.subOfTwo(22, 2);
		obj.mulOfTwo(22, 12);
		obj.divOfTwo(22, 2);
	//	System.out.println(obj.result);
	}
}
