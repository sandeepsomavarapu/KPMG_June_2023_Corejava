package com.kpmg.collections;

import java.util.ArrayList;

//1)collections can hold both homogeneous and heterogeneous data(similar data)
//2)collections are not fixed in size  
//3)lots utility methods
//
//-->duplicates are allowed 
//-->insertion order is preserved 

public class ListEx {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("naresh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("mahesh");
		al.add("hitesh");
		al.add("rajesh");
		al.add("somesh");
		al.add("sandeep");
		al.add("phani");
		al.add("welcome");
		//al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.remove("welcome");
		System.out.println(al.contains("sandeep"));
		ArrayList<String> al1 = new ArrayList<String>();

		al1.add("KPMG");
		al1.add("Hyderabad");
		System.out.println(al1);
		al1.addAll(al);
		System.out.println(al1.containsAll(al));
		System.out.println(al1);
		al1.retainAll(al);
		System.out.println(al1);

	}
}
