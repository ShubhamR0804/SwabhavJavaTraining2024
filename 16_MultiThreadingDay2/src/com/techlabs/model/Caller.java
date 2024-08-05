package com.techlabs.model;

import java.lang.annotation.Target;

public class Caller implements Runnable{
	
	private String message;
	private CallMe target;
	private Thread thread;
	
	

	public Thread getThread() {
		return thread;
	}



	public void setThread(Thread thread) {
		this.thread = thread;
	}



	public Caller(String message, CallMe target) {
		super();
		this.message = message;
		this.target = target;
		thread = new Thread(this);
		thread.start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (target) {
			target.call(message);
		}
		
		
	}
	

}
