package com.kpmg.java8;

import java.util.Date;

interface Calci_Demo {
	public abstract void displayDate();
}

public class MethodReferenceEx {
	public MethodReferenceEx() {
		Date date = new Date();
		System.out.println(date);
	}

	public static void printDate() {
		Date date = new Date();
		System.out.println("Today's Date :" + date);
	}

	public static void main(String[] args) {
		MethodReferenceEx obj = new MethodReferenceEx();

		Calci_Demo demo = MethodReferenceEx::printDate;
		demo.displayDate();
		Calci_Demo demo1 = MethodReferenceEx::new;
		demo1.displayDate();

	}

}
