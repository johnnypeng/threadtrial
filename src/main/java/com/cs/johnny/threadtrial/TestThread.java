package com.cs.johnny.threadtrial;

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;

	ThreadDemo(String name) {
		this.threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}

public class TestThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo r1 = new ThreadDemo("thread-1");
		r1.start();

		ThreadDemo r2 = new ThreadDemo("thread-2");
		r2.start();
	}
}
