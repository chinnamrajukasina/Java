package interview.programs;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = readNumber();
		sumOfNumbers(n);
	}

	private static void sumOfNumbers(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum of numbers upto given no " + n + " is :" + sum);

	}

	private static int readNumber() {
		System.out.println("enter a number to get sum  upto given number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;

	}

}
