package interview.programs;

import utility.Utility;

public class NumberSeries {

	public static void main(String[] args) {
		System.out.println(" to get upto that number in selected series");
		int number = Utility.readNumber();
		System.out.println("press 0 - if you want number series ");
		System.out.println("press 1 - if you want Odd number series ");
		System.out.println("press 2 - if you want Even number series ");
		int condition = Utility.readNumber();
		if (condition == 0)
			numberSeries(number);
		else if (condition == 1)
			oddNumberSeries(number);
		else if (condition == 2)
			evenNumberSeries(number);
		else
			System.out.println("please re enter your choice as given manner");
	
	}

	private static void evenNumberSeries(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
	}

	private static void oddNumberSeries(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
	}

	private static void numberSeries(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}

	}
}
