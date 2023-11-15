package interview.programs.collections;

import java.util.ArrayList;
import java.util.List;

public class myArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myArrayList = new ArrayList<>();
		myArrayList.add("Vijay");
		myArrayList.add(0, "Raju");
		myArrayList.add("Prasad");
		//myArrayList.remove(myArrayList.size()-1);
		System.out.println(myArrayList);
		

	}

}
