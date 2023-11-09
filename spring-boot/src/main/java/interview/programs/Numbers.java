package interview.programs;

import utility.Utility;

public class Numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= Utility.readNumber();
		sumOfTheDigits(n);
		reverseOfTheDigits(n);
		natureOfTheNumber(n);

	}

	private static void natureOfTheNumber(int n) {
		// TODO Auto-generated method stub
		String result = n%2==0 ? "Even" : "Odd" ;
		System.out.println("given the number "+ n +" is a " +result);
		
	}

	private static void reverseOfTheDigits(int n) {
		// TODO Auto-generated method stub
		int m=0,r=0,t=n;
		while (n>=1) {
			m=n%10;
			n=n/10;
			r=r*10+m;		
		}
		System.out.println("reverse of the number "+ t+" is " +r);
	}

	private static void sumOfTheDigits(int n) {
		// TODO Auto-generated method stub
		int c=0,t=n;
		while(n>=1) {
			int l=n%10;
			n=n/10;
			c= c+l;
		}
		System.out.println("sum of the digites of the number  "+t +" is " +c);
	}

}
