package com.kpmg.oops;

public class Const_Ex {

	public void m1() {
		System.out.println("am from m1 method");
	}
	public Const_Ex()
	{
		System.out.println("am from default constructor");
	}
	public Const_Ex(String name)
	{
		System.out.println("am from param constructor : "+name);
	}
	public static void main(String[] args) {
		Const_Ex obj = new Const_Ex("KPMG");// JVM
		obj.m1();
	}

}
