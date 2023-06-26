package com.kpmg.threads;

public class ThreadEx1 implements Runnable {// java.lang ---FI>SAM

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Ex..");
		}
	}

	public static void main(String[] args) {
		ThreadEx1 obj = new ThreadEx1();
		Thread thread = new Thread(obj);
		thread.start();// run

	}

}
