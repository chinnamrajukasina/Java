package arrays.collections.exceptions.treads;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set= new HashSet<>();
		
		String xq = "Chinna";
		set.add(xq);
		set.add("Vij");
		set.add("Raju");
		set.add("Vij");
		boolean x = set.contains("Vij");
		
		
		System.out.println(x);
		
		System.out.println(set);
		
		
		//Set mySet = new Set();
		
		
		
		
		
		
		
	}

}
