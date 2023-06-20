package com.kpmg.basics;

public class Variables_Ex {
	// global variables
	static int countryCode = 91;// 4 bytes,method area ,at the time loading into JVM
	long contact = 9494949494l;// 8 bytes,heap area,object creation
	float marks = 23.45f;

	public static void main(String args[]) {

		// local variables
		byte age = 123;
		float marks = 22.4324324233433f;
		double salary = 22.4324324233433;
		char gender = 'M';
		boolean result = true;
		System.out.println("welcome to java world");
		System.out.println(marks + " : " + salary);
		System.out.println(gender + " : " + age);
		System.out.println(Variables_Ex.countryCode);
		Variables_Ex obj = new Variables_Ex();
		System.out.println(obj.contact);
		System.out.println(obj.marks);
	}
	//add comments -->ctrl+/
	//for multi line comments -->ctrl+shift+/
	//for removing multi line comments -->ctrl+shift+\
	
}