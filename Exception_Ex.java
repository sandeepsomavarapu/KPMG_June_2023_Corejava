package com.kpmg.exceptions;

public class Exception_Ex {

	public static void validate(int age) throws AgeNotValid {
		if (age < 18) {
			throw new AgeNotValid("You are not eligible to vote ...");
		} else {
			System.out.println("You are allowed to vote ...");
		}
	}

	public static void main(String[] args) throws AgeNotValid {
		try {
			Exception_Ex.validate(12);
		} catch (AgeNotValid e) {
			System.out.println("Invalid Age");
		} finally {
			System.out.println("cleanup code....");
		}
		System.out.println("remainings lines of code");

	}

}










