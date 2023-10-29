package arrays.collections.exceptions.treads;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();

		map.put(23, "prasad");
		map.put(24, "vijay");
		map.put(45, "Raju");
		map.put(78, "Venky");

		System.out.println(map.get(78));
		System.out.println(map);
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("-----");
		for (Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}

		map.entrySet().stream().forEach(e -> System.out.print(e.getKey() + " " + e.getValue()));

	}
}