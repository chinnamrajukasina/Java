package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class myArrayDeque {

	public static void main(String[] args) {
		 Deque<Integer> adq
         = new ArrayDeque<Integer>(10);

     // add() method to insert
     adq.add(10);
     adq.add(20);
     adq.add(30);
     adq.add(40);
     adq.add(50);

     System.out.println(adq);

     // clear() method
     adq.clear();

     // addFirst() method to insert the
     // elements at the head
     adq.addFirst(564);
     adq.addFirst(291);

     // addLast() method to insert the
     // elements at the tail
     adq.addLast(24);
     adq.addLast(14);

     System.out.println(adq);
 }
}
