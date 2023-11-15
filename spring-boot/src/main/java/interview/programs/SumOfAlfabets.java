package interview.programs;

import java.util.Scanner;

public class SumOfAlfabets {

	public static void main(String[] args) {
		String str = readString();
		String lowerStr = convertToLowerCase(str);
		sumOfAlfabets(lowerStr);
	}

	private static String convertToLowerCase(String str) {
		String lowerStr = str.toLowerCase();
		return lowerStr;
	}

	private static void sumOfAlfabets(String lowerStr) {
		int count = 0;
		for (int i = 0; i < lowerStr.length(); i++) {
			count = count + lowerStr.charAt(i) - 'a'+1;
		}
		System.out.println("sum of alfabets in given word is :" + count);
	}

	private static String readString() {
		System.out.println("please enter a word");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		return str;
	}

}
