package interview.programs.practice;

import java.util.*;

public class RepeatedChars {

	public static void main(String[] args) {
String input ="Hello World";
repeatedChars(input);

	}

	private static void repeatedChars(String input) {
		List<Character> repeated = new ArrayList<>();
		for(int i=0;i<input.length()-1;i++) {
			for(int j=i+1;j<input.length()-1;j++) {
				if(input.charAt(i)==input.charAt(j))
					repeated.add(input.charAt(i));
			}
		}
		System.out.println(repeated);

}

}
