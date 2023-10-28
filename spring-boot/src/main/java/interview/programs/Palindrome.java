package interview.programs;

import prasad.exam.Utility;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome();
	}

	private static void palindrome() {
		// TODO Auto-generated method stub
		String pal = Utility.readString();
		System.out.println(pal);
		String rev = "";
		for (int i = pal.length() - 1; i >= 0; i--) {
			rev = rev + pal.charAt(i);
		}
		System.out.println(rev);
		int count = 0;
		for (int i = 0; i < pal.length(); i++) {
			if (pal.charAt(i) == rev.charAt(i))
				count++;
		}
		if (count == pal.length())
			System.out.println("Given word " + pal + " is a Palindrome ");
		else
			System.out.println("Given word " + pal + " is not a Palindrome ");

	}

}
