package com.collections.queue;

import java.util.PriorityQueue;

public class myPriorityQueue {
	public static void main(String args[]) {
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Raju");
		pq.add("vijay");
		pq.add("prasad");
		System.out.println(pq);
		pq.remove("prasad");
		System.out.println("pq after remove prasad" + pq);
		String element = pq.peek();
		System.out.println("Accessed Element using peek: " + element);
		System.out.println("Poll Method - " + pq.poll());
		System.out.println("Final PriorityQueue - " + pq);

	}

}
