package interview.programs.basic;
import utility.Utility;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseOfString();
	}

	private static void reverseOfString() {
		// TODO Auto-generated method stub
		String st= Utility.readString();
		for (int i= st.length()-1;i>=0; i--) {
		System.out.print(st.charAt(i));
	}
	}
}
