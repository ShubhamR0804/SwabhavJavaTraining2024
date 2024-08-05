package com.poc;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		// Create a Queue of Integers using LinkedList
		Queue<Integer> queue = new LinkedList<>();

		// Add elements to the Queue
		queue.add(10);
		queue.add(20);
		queue.add(30);

		// Display the Queue
		System.out.println("Queue: " + queue);

		// Remove an element from the Queue
		int removedElement = queue.poll();
		System.out.println("Removed Element: " + removedElement);

		// Display the Queue after removal
		System.out.println("Queue after removal: " + queue);

		// Peek at the front element of the Queue
		int frontElement = queue.peek();
		System.out.println("Front Element: " + frontElement);
	}
}
