package com.cs.johnny.threadtrial.demo;

public class DisplayMessage implements Runnable {
	private String message;
	private static int i = 0;

	public DisplayMessage(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			i++;
			System.out.println(i + " " + message + " " + this.getClass().getName());
		}
	}

}
