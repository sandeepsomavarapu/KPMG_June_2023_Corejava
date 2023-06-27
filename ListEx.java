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

		ArrayList al = new ArrayList();
		al.add(123);
		al.add("mahesh");
		al.add(true);
		al.add("mahesh");

		System.out.println(al);
	}
}
