package com.kpmg.collections;

import java.util.Comparator;
import java.util.TreeSet;
//1)collections can hold both homogeneous and heterogeneous data(similar data)
//2)collections are not fixed in size  
//3)lots utility methods
//
//-->duplicates are not allowed 
//-->insertion order is not preserved 

public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>(new MyOrder());// --->Comparable-->FI-->NSO-->compareTo
		al.add("naresh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("akash");
		al.add("hitesh");
		al.add("rajesh");
		al.add("somesh");
		al.add("sandeep");
		al.add("phani");
		al.add("chetan");
		System.out.println(al);
	}
}

class MyOrder implements Comparator<String> {

	@Override
	public int compare(String obj1, String obj2) {

		//return -obj1.compareTo(obj2);
		return obj2.compareTo(obj1);
	}

}
