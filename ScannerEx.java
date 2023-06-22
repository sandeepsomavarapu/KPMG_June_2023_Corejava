package com.kpmg.basics;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = scan.next();
		System.out.println("Enter your salary");
		float salary = scan.nextFloat();
		System.out.println("Enter First for addition: ");
		int a = scan.nextInt();
		System.out.println("Enter Second for addition: ");
		int b = scan.nextInt();
		int result = a + b;
		System.out.println("add off two numbers :" + result);

		System.out.println(name+" "+salary);
	}

}
