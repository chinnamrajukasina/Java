package interview.programs.basic;
import utility.Utility;

public class Factorial {
	
	
	public Factorial() {
		
		super();
	}

	public static void main(String[] args) {
	int n=Utility.readNumber(), temp=1;
	for (int count=1;count<=n;count++) {
		temp=temp*count;
	
	
	}
	System.out.println("factotial of given number is"+ temp );
}
}