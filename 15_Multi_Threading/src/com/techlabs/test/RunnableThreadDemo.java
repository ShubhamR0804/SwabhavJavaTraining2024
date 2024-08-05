package com.techlabs.test;

import com.techlabs.model.RunnableThread;

public class RunnableThreadDemo {

	public static void main(String[] args) {
		RunnableThread thread1 = new RunnableThread("Thread 1");
		RunnableThread thread2 = new RunnableThread("Thread 2");
		RunnableThread thread3 = new RunnableThread("Thread 3");

		System.out.println(thread1.getThread().isAlive());

		System.out.println(thread2.getThread().isAlive());

		System.out.println(thread3.getThread().isAlive());
		
		thread1.getThread().setPriority(Thread.MAX_PRIORITY);
		thread2.getThread().setPriority(Thread.MIN_PRIORITY);
		thread3.getThread().setPriority(Thread.MAX_PRIORITY);
		// main thread
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}

		try {
			thread1.getThread().join();
			thread2.getThread().join();
			thread3.getThread().join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}

		System.out.println(thread1.getThread().isAlive());

		System.out.println(thread2.getThread().isAlive());

		System.out.println(thread3.getThread().isAlive());
	}

}
