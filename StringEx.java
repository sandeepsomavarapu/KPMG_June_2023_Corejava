package com.kpmg.string;

public class StringEx {

	public static void main(String[] args) {

		String orgName = "kpmg";// string literal immutable
		String orgname1 = "kpmg";

		System.out.println(orgName.concat(" hyderabad"));

		System.out.println(orgName);

		System.out.println(orgName.equals(orgname1));// true
		System.out.println(orgName.equalsIgnoreCase(orgname1));// true
		System.out.println(orgName == orgname1);// true
		System.out.println(orgName.compareTo(orgname1));// 0

		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if both are same

		System.out.println("apmg".compareTo("kpmg"));

		String orgName1 = new String("kpmg");// string new keyword
		String orgName2 = new String("kpmg");// string new keyword

		System.out.println(orgName1.equals(orgName2));// true
		System.out.println(orgName1.equalsIgnoreCase(orgName2));// true
		System.out.println(orgName1 == orgName2);// false

		StringBuffer sb = new StringBuffer("rps");
		StringBuffer sb1 = new StringBuffer("rps");

		sb.append(" hyderabad");
		System.out.println(sb);
		
		System.out.println(sb.equals(sb1));//==

		System.out.println(sb == sb1);

	}

}
