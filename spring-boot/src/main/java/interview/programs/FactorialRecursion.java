package interview.programs;

import utility.Utility;

public class FactorialRecursion {
	public static void main(String[] args) {
		int fact=1;
		System.out.println("To find factoial,..");
	int number=Utility.readNumber();
		fact=factorial(number);
		System.out.println("Factorial of given number "+number+"is "+fact);
		
		
		
}
	static int factorial(int n) {
		if (n==0)
			return 1;
		else  			
		return n*factorial(n-1);
	}
	
}