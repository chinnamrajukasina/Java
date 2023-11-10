package com.kcr.java8;

import java.util.*;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().map(e -> e + " ").filter(e -> e.startsWith("1")).forEach(System.out::print);
	}

}
