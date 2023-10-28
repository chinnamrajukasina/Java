package prasad.exam;

public class evenNumbersWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println("Printing even numbers form 1 to 50 using while loop");
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
