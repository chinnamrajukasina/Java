package com.collections.list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myLinedList = new LinkedList<>();
		myLinedList.add("Raju");
		myLinedList.add("Vijay");
		myLinedList.add("Prasad");
		myLinedList.add(2, "index2");
		System.out.println(myLinedList);
		System.out.println(myLinedList.contains("Raju"));
		myLinedList.remove(2);
		System.out.println(myLinedList);
		myLinedList.add("sambar");
		System.out.println(myLinedList);

	}

}
