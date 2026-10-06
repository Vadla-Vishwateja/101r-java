package com.thread;


class D{
	int count=0;
	public void increment() {
		count++;
	}
	public void getCount() {
		System.out.println(count);
	}
}

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		
		D d=new D();
		System.out.println("Main Method Started...");
		
		Thread th1=new Thread(()->{
			for(int i=1;i<=200;i++) {
				d.increment();
			}
		});
		
		Thread th2=new Thread(()->{
			for(int i=1;i<=200;i++) {
				d.increment();
			}
		});
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		d.getCount();
	}

}
