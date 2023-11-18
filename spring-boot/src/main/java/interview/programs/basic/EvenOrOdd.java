package interview.programs.basic;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputNumber();
		evenOrOdd(n);

	}

	private static int inputNumber() {
		System.out.println("please enter an number to find even or odd");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	private static void evenOrOdd(int n) {
		if (n % 2 == 0) {
			System.out.printf("The given number %d is even", n);
		} else {
			System.out.printf("The given number %d is odd", n);
		}

	}
}
