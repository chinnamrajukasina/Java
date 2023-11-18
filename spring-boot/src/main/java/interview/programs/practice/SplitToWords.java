package interview.programs.practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class SplitToWords {

	public static void main(String[] args) {
		String input = "java is java for the java to the java";
		splitTOWords(input);
		mapWords(input);

	}

	private static void mapWords(String input) {

		String[] splitted = input.split(" ");
		Map<Integer, String> map = Arrays.stream(splitted).collect(Collectors
				.toMap(word -> Arrays.asList(splitted).indexOf(word), word -> word, (a, b) -> a, TreeMap::new));
		map.forEach((position, word) -> System.out.println("Position: " + position + ", Word: " + word));
	    
	}

	private static void splitTOWords(String input) {
		String[] splitted = input.split(" ");
		Arrays.asList(splitted).forEach(System.out::print);
		System.out.println("\ntotal words in the list is :" + splitted.length);
	}

}
