package com.kpmg.oops;

import java.util.Date;

interface ParentTest {
	// by default interface methods are public abstract
	// by default interface variables are public static final
	void add(int a, int b);// public abstract void add(int a,int b);

	void mul(int a, int b);// public abstract void add(int a,int b);
}

abstract class Test {
	int age = 22;

	public abstract Date printDate();// abstract method

	public void printAge()//
	{
		++age;
		System.out.println("Age : " + age);
	}
}

public class Abstraction_Test extends Test {

	public void m1()// concrete method/non-abstract method
	{
		System.out.println("Hello am from m1 method");
	}

	public static void main(String[] args) {
		Abstraction_Test obj = new Abstraction_Test();
		obj.m1();
		obj.printAge();
		System.out.println(obj.printDate());
	}

	@Override
	public Date printDate() {
		Date date = new Date();
		return date;
	}

}
