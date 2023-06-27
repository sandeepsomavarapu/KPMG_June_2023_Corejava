package com.kpmg.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();

		emps.put(111, "suresh");
		emps.put(321, "naresh");
		emps.put(454, "rajesh");
		emps.put(787, "somesh");
		emps.put(66, "hitesh");
		emps.put(111, "akash");
		emps.put(445, "sandeep");
		emps.put(987, "phani");

		System.out.println(emps);
		System.out.println(emps.get(111));
		System.out.println(emps.remove(111));
		System.out.println(emps);

		Set<Entry<Integer, String>> entries = emps.entrySet();
		Iterator<Entry<Integer, String>> itr = entries.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

//		Set<Integer> keys = emps.keySet();
//		Iterator<Integer> itr = keys.iterator();
//		while (itr.hasNext()) {
//			int key = itr.next();
//			System.out.println(key + " : " + emps.get(key));
//
//		}

	}
}
