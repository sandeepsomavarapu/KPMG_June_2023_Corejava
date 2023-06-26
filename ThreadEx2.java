package com.kpmg.threads;

public class ThreadEx2 extends Thread { // 2 threads
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		Thread.currentThread().setName("KPMG");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("ParentThread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

		ThreadEx2 obj = new ThreadEx2();
		obj.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread..");
		}
	}

}
