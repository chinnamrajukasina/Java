package com.kcr.java8;

import java.util.*;
import java.util.stream.Collectors;

public class IntegerOperations {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		findDuplicateElements(myList);
		findEvenNumberElements(myList);
		findTheFirstElement(myList);
		findTheMaxValue(myList);

	}

	private static void findTheMaxValue(List<Integer> myList) {
		int max = myList.stream().max(Comparator.naturalOrder()).get();
		System.out.println("the maximum value in the list is " + max);
	}

	private static void findTheFirstElement(List<Integer> myList) {
		int first = myList.stream().findFirst().get();
		System.out.println("the first element in the list is " + first);
	}

	private static void findEvenNumberElements(List<Integer> myList) {
		List<Integer> evenList = myList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("even numbers in the List is " + evenList);
	}

	private static void findDuplicateElements(List<Integer> myList) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicateSet = myList.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
		System.out.println("duplicate elements in the list is " + duplicateSet);

	}

}
