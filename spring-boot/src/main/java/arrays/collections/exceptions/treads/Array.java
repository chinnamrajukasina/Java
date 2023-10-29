package arrays.collections.exceptions.treads;

public class Array extends Object {

	static int height = 20;
	int age;
	String name;

	public static void main(String[] args) {

		Array array = new Array();
		System.out.println(array.equals(null));

	}

	@Override
	public boolean equals(Object obj) {
		return false;

	}

}
