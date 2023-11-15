package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myArrayList = new ArrayList<>();
		myArrayList.add("Raju");
		myArrayList.add("Vijay");
		myArrayList.add("Prasad");
		myArrayList.add(2, "index2");
		System.out.println(myArrayList);
		System.out.println(myArrayList.contains("Raju"));
		myArrayList.remove(2);
		System.out.println(myArrayList);

	}

}
