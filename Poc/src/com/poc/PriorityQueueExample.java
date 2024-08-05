package com.poc;

import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueExample {
	public static void main(String[] args) {
        // Create a PriorityQueue of Integers
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(10);

        // Display the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Remove and display elements from the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removed Element: " + priorityQueue.poll());
        }
    }

}
