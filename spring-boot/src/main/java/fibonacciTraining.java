import prasad.exam.Utility;

public class fibonacciTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0, b=1,c = 0;
System.out.println("enter a number to show fibonacci series up to ");
int n= Utility.readNumber();
System.out.print(a+","+b);
for(int i=1;i<n-1;i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.print(","+c);
	
}

System.out.println();
System.out.println("fibbonacci series last no is"+ c);

	}

}
