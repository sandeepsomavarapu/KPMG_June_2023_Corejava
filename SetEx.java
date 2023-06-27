package com.kpmg.collections;

import java.util.TreeSet;
//1)collections can hold both homogeneous and heterogeneous data(similar data)
//2)collections are not fixed in size  
//3)lots utility methods
//
//-->duplicates are not allowed 
//-->insertion order is not preserved 

public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>();
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
		System.out.println(al);
	}

}
