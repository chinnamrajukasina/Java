package interview.programs.basic;

public class Arrays {

	public static void main(String[] args) {
		int numbers[] = new int[5];

		// printArray(numbers);

		numbers[0] = 2;
		numbers[1] = 3;
		numbers[2] = 5;
		numbers[3] = 7;
		numbers[5] = 1;

		printArray(numbers);

	}

	static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("element is -> " + numbers[i]);
		}

	}

}
