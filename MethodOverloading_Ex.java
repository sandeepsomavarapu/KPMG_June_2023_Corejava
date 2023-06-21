package com.kpmg.oops;

public class MethodOverloading_Ex {
	public void add(int a, int b, int c) {
		System.out.println("add of three int's : " + (a + b + c));
	}

	public void add(int a, int b) {
		System.out.println("add of two int's : " + (a + b));
	}

	public void add(float a, float b) {
		System.out.println("add of two float's : " + (a + b));
	}

	public void add(int a, float b) {
		System.out.println("add of int,float  : " + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("add of float,int  : " + (a + b));
	}

	public static void main(String[] args) {
		MethodOverloading_Ex obj=new MethodOverloading_Ex();
				obj.add(12, 13);
				obj.add(23.5f, 23.2f);
				obj.add(12, 23.5f);
				obj.add('a','b');//type promotion in java
	}

}
