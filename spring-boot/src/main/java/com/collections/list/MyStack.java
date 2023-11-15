package com.collections.list;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
Stack <String> myStack = new Stack<>();
myStack.add("Raju");
myStack.add("Vijay");
myStack.add("Ramu");
System.out.println(myStack);
System.out.println("The element at the top of the"
        + " stack is: " + myStack.peek());
System.out.println("Popped element: "
        + myStack.pop());

// Displaying the Stack after pop operation
System.out.println("Stack after pop operation "
        + myStack);


	}

}
