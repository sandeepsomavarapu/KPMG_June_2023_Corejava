package com.kpmg.oops;

class Parent_Ex {
	int a = 333;

	public Parent_Ex() {
		System.out.println("parent class default constructor");
	}

	public Parent_Ex(int marks) {
		System.out.println("parent class param constructor : " + marks);
	}

	public void displayMsg() {
		System.out.println("am from parent class method");
	}

}

public class ThisSuperEx extends Parent_Ex {
	int a = 222;

	public ThisSuperEx() {
		this("KPMG");
		System.out.println("current class default constructor");
		this.displayMsg();
		super.displayMsg();
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public ThisSuperEx(String orgName) {
		super();
		System.out.println("current class param constructor");
	}

	@Override
	public void displayMsg() {
		System.out.println("am from current class method");

	}

	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx();//heap area
		System.out.println(obj);//address of the 
		System.out.println(obj.toString());//address of the 
	}

}
