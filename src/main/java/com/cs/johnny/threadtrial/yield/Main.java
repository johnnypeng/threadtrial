package com.cs.johnny.threadtrial.yield;

class ThreadYield extends Thread {
	public ThreadYield(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("" + this.getName() + "-----" + i);
			// 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
			if (i == 30) {
				Thread.yield();
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadYield yt1 = new ThreadYield("张三");
		ThreadYield yt2 = new ThreadYield("李四");
		yt1.start();
		yt2.start();
	}

}
