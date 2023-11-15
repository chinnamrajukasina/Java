package interview.programs;

import prasad.exam.Utility;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pal = Utility.readNumber(),temp=pal,rev=0,sum=0;
		while (temp>0) {	
		rev=temp%10;
		sum=sum*10+rev;
		temp=temp/10;
		

}
		if (pal==sum)
			System.out.println("given number is Palindrom");
		else
			System.out.println("given number is not Palindrom");
}
}