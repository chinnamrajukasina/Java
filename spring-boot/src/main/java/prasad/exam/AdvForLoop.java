package prasad.exam;

public class AdvForLoop {

	public static void main(String[] args) {
printNumbers(100);
	}

	private static void printNumbers(int i) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) 
            System.out.println(number);		
	}

}
