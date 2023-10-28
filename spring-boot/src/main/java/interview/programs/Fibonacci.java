package interview.programs;

import prasad.exam.Utility;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print up to that number of Fibonacci series so");
		int n = Utility.readNumber();
		int a = 0, b = 1, c, i;
		System.out.print(a + "," +b);
		for (i = 0; i < n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print("," + c);

		}

	}

}
