package interview.programs;

import prasad.exam.Utility;

public class ArmstrongSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Utility.readNumber();
		Armstrong(n);

	}

	static void Armstrong(int n) {
		int temp1, temp2;
		System.out.println("Armstrong Series up to given number " + n + "is:");
		for (int i = 1; i <= n; i++) {
			temp1 = i;
			int pow = 0, sum = 0;

			while (temp1 > 0) {
				temp1 = temp1 / 10;
				pow++;
			}
			// System.out.println("p"+pow);
			temp2 = i;
			while (temp2 > 0) {
				sum = (int) (sum + Math.pow(temp2 % 10, pow));
				temp2 = temp2 / 10;

			}
			// System.out.println("s"+sum);
			if (i == sum)
				System.out.print(sum + ", ");
		}

	}
}
