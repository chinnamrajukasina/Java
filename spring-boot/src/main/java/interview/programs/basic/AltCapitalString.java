package interview.programs.basic;

import utility.Utility;

public class AltCapitalString {

	public static void main(String[] args) {
		String givenString = Utility.readString("please enter the string ...");
		altCapitalString(givenString);

	}

	private static void altCapitalString(String givenString) {
		char[] given = givenString.toCharArray();
		char[] upper = givenString.toUpperCase().toCharArray();
		char[] empty = new char[givenString.length()];
		// System.out.println(upper);
		for (int i = 0; i < givenString.length(); i++) {
			if (i % 2 == 0) {
				empty[i] = upper[i];
			} else
				empty[i] = given[i];

		}
		System.out.println(empty);
	}

}
