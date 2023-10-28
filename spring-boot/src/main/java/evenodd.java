
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		int i;
		for(i=2;i<100;i++)
			
		if (isPrime(i)){
			System.out.println(i+ " number is prime");
		}
		else {
			//System.out.println(i+ " number is non prime");
		}
	}
	
	public static boolean isEven(int i) {
		if (i % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPrime(int n ) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		
		if (count == 0) {
			return true;
		}else {
			return false;
		}
	}
	

}
