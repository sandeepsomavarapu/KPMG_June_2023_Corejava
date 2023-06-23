package com.kpmg.exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for division:");
		int a = scan.nextInt();
		System.out.println("Enter second number for division:");
		int b = scan.nextInt();
		try {
			int result = a / b;
			System.out.println("division of two numbers  :" + result);
		} catch (ArithmeticException e) {
			System.out.println("Denominator cannot be zero");
		}
		System.out.println("Remaining 1000 lines code ");
		scan.close();

	}

}
