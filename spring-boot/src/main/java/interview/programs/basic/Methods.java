package interview.programs.basic;
import java.util.Date;

public class Methods {

	public static void main(String[] args) {
		
		sum (2, 3);

		String[] names = new String[] {"name1", "name2"};
		printNames(names);
		
		
		printDateTime(); // no param no return
		
		Date todayDate = getDate();
		
		System.out.println(todayDate);
		
		//int squarae = getSquare(2);
		
		//Object c = getFactorialObject();
		
		
		/// parent ref child obj ***** run time polymorphysm 
		
//		Shape - circle , square, hexagon 
//		.draw
//		
//		
//		Square square = new Square(); //34520assd
//		Square rectangle = square;
//		
//		
//		Shape shape = new Shape();
//		
//		shape = square;
//		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

//	private static Object getFactorialObject() {
//		Factorial factorialObj = new Factorial();
//		return factorialObj;
//		
//	}










//	private static int getSquare(int i) {
//		// TODO Auto-generated method stub
//		return i * i;
//	}










	private static Date getDate() {
		
		return new Date();
	}

	private static void printDateTime() {
		System.out.println(new Date());
		
	}

	private static void printNames(String[] names) {
		// TODO Auto-generated method stub
		
	}

	private static void sum(int i, int j) {
		int result = i + j;
		System.out.println(result);
		
	}
	
	
	

}
