package interview.programs.Infosys;

import java.util.*;

public class WordsInOrder {

	public static void main(String[] args) {
		String input = "laptop mobile and desktop are not exempt";
		String output = sortWords(input);
		System.out.println(output);

	}

	private static String sortWords(String input) {
		// TODO Auto-generated method stub
		String[] words = input.split(" ");
		Arrays.sort(words,new Comparator<String>() {
			public int compare(String s1, String s2) {
				int lengthComparisin = Integer.compare(s1.length(), s2.length());
				return (lengthComparisin !=0)? lengthComparisin:s1.compareTo(s2);
			}
		});
		
		return String.join(" ", words);
	}

}
