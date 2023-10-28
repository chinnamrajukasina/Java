package interview.programs;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= inputNumber();
		isPrime(n);
		
	
	}

	private static void isPrime(int n) {
		int count=0;
		for(int i=1;i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if (count==2)
			System.out.printf("given number %d is prime number",n);
		else
			System.out.printf("given number %d is Not prime number",n);
	}

	private static int inputNumber() {
		System.out.println("please enter an number to find ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
}
