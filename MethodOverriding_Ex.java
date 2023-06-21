package com.kpmg.oops;

import java.util.Date;

 class SuperParent {//final-->variable,method,class
	 int age = 30;

	public  void printAge() {
		++age;
		System.out.println("Age is : " + age);
	}

	public void printDate() {

		System.out.println("Today's Date  is : " + new Date());
	}
}

public class MethodOverriding_Ex extends SuperParent {

	public static void main(String[] args) {
		MethodOverriding_Ex obj = new MethodOverriding_Ex();
		obj.printAge();
		obj.printDate();
	}
	@Override
	public void printAge() {
		--age;
		System.out.println("Age is : " + age);
	}
}
