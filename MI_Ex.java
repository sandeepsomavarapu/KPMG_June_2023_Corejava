package com.kpmg.oops;

interface Parent1 {
	public void m1();
}

interface Parent2 {
	public void m1();
}

public class MI_Ex implements Parent1, Parent2 {
	public static void main(String[] args) {
		MI_Ex obj = new MI_Ex();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("am from MI_EX m1 method");
	}

}
