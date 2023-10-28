package arrays.collections.exceptions.treads;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> map= new HashMap<>();

	map.put("Apples", 190);
	map.put("Apples", 150);
	map.put("Apples", 130);
map.put("Balls", 50);
map.put("Cats", 25);

if(map.get("Apples") - 20 < 0) {
	System.out.println("not available");
}else {
	int count = map.get("Apples");
	int updatedCount = count - 20;
	map.put("Apples", updatedCount);
	System.out.println("count updated to " + map.get("Apples"));
}


	}

}
