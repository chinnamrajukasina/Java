package prasad.exam;

import java.util.Scanner;

public class Utility{
	
	static Scanner sc = new Scanner(System.in);

	public static int readNumber() {
		System.out.println("Please enter a Number...");
		//Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
	//	sc.close();
		return i; 
		}	
	
	public static String readString() {
		System.out.println("Please enter a String...");
//		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
	//	sc.close();
		return str; 
		}	
	
	
	
	
	
	}

	


