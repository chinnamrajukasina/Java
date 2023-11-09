package interview.programs.basic;
import utility.Utility;

public class Prime {

	public static void main(String[] args) {

		int p = Utility.readNumber();
		PrimeNumber(p);
	}

	private static void PrimeNumber(int p) {
		int count = 0;
		for (int i = 1; i <= p; i++) {
			if (p % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println("Given number is a Prime Number " + p);
		else
			System.out.println("Given number is not a Prime Number " + p);

	}

}
