package com.kcr.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperations {

	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		List<String> list1 = Arrays.asList("Java", "8");
		concatenateStream(input, list1);
		firstNonRepeatedChar(input);
		findFirstRepeatedChar(input);
	}

	private static void concatenateStream(String input, List<String> list1) {
		Stream<String> concatenatedStream = Stream.concat(input.chars().mapToObj(c -> String.valueOf((char) c)),
				list1.stream());
		concatenatedStream.forEach(System.out::print);
		System.out.println();
	}

	private static void findFirstRepeatedChar(String input) {
		char result = input.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(c -> c, v -> 1, Integer::sum))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst()
				.orElse('\0');
		System.out.println((result != '\0') ? "The first repeated character is: " + result
				: "No repeated character found in the string.");

	}

	private static void firstNonRepeatedChar(String input) {
		char result = input.chars().filter(c -> input.indexOf(c) == input.lastIndexOf(c)).mapToObj(c -> (char) c)
				.findFirst().orElse('\0');
		System.out.println((result != '\0') ? "The first non-repeated character is: " + result
				: "No non-repeated character found in the string.");
	}
}