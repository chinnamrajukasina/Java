
public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers(5);
		evenNumbers(10);
		
		
	}
	
	static void numbers(int n){
		System.out.println("printing numbers up to "+ n);
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
			
	static void evenNumbers(int n) {
		System.out.println("printing even numbers up to "+ n);
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);	
			}
		}
			
		
			
	}
		
		
		
		
		
		
	}

