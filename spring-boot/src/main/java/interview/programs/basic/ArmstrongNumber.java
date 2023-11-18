package interview.programs.basic;
import utility.Utility;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Utility.readNumber(),temp1=n,temp2=n,pow=0,sum = 0;
	
		while(temp1>0) {
			temp1=temp1/10;
			pow++;
			}

		while(temp2>0) {
			sum= (int) (sum+ Math.pow(temp2%10,pow));
			temp2=temp2/10;
			
			
		}
		if(n==sum)
		System.out.println("given number "+n+" is armstrong number" );
		else
			System.out.println("given number "+n+ "is not armstrong number" );
			
			}

}
