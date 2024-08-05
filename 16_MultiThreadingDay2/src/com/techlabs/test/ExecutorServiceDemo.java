package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.model.Task;

public class ExecutorServiceDemo {
	
	public static void main(String[] args) {
		
		//int coreCount = Runtime.getRuntime().availableProcessors();
		
		//System.out.println("Available cores : " +coreCount);
		
		// For assigning the fixed number of threads to be created 
		//ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		// For As Many Threads are required by the processor
		//ExecutorService service = Executors.newCachedThreadPool();
		
		// For Single Thread allocation
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		
		for(int i = 0; i<1000; i++)
			service.execute(new Task());
		
		
	
	}

}
