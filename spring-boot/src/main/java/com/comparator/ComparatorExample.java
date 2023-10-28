package com.comparator;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new TreeSet<>(Collections.reverseOrder());
		
		set.add("chanti");
		boolean first = set.add("aadi");
		
		boolean second = set.add("aadi");
		
		set.add("zoom");
		set.add("1vijay");
		set.add("AADI");
		System.out.println(set);
		System.out.println(first +  " and " + second);
	}

}
