package utility;

import java.util.Scanner;

public class Utility {

	static Scanner sc = new Scanner(System.in);

	public static int readNumber() {
		System.out.println("Please enter a Number...");
		int i = sc.nextInt();
		return i;
	}

	public static int readNumber(String input) {
		System.out.println(input);
		int i = sc.nextInt();
		return i;
	}

	public static String readString() {
		System.out.println("Please enter a String...");
		String str = sc.nextLine();
		return str;
	}

	public static String readString(String input) {
		System.out.println(input);
		String str = sc.nextLine();
		return str;
	}

}
