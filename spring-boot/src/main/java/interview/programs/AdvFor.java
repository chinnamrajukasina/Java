package interview.programs;

import java.util.ArrayList;
import java.util.List;

public class AdvFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[] {"name1", "name2", "name3"};
		
		for (int i =0 ; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String n : names) {
			System.out.print(n);
		}
		
		List<String> addresses = new ArrayList<>();
		addresses.add("address1");
		addresses.add("address2");
		addresses.add("address3");
		
		
		for (int i =0 ; i< addresses.size(); i++) {
			System.out.println(addresses.get(i));
		}
		
		for(String l: addresses) {
			System.out.println(l);
		}
		
		int[] ages = new int[] {1,2,3,4,5};
		
		for(int a: ages) {
			System.out.println(a);
		}
		
		
		List<Integer> salaries = new ArrayList<>();
		salaries.add(1);
		
		// auto boxing auto unboxing 
		
		Integer x = 5;
		int y = 6;
		
		
		
		x = y;
		
		
		y = x;
		
//		String z = x;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}