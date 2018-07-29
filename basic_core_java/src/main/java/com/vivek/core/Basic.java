/**
 * 
 */
package com.vivek.core;

public class Basic extends Thread {

	Basic basic;
	int x = 89;
	int i = 45;
	int u = 90;

	@Override
	public void run() {
		synchronized (basic) {

		}
		System.out.println("run");
	}

	@Override
	public synchronized void start() {
		System.out.println("start");
	}

	public static void main(String[] args) {
		System.out.println("main");
		Basic basic = new Basic();
		basic.start();

		/*
		 * try { System.out.println("hello"); Thread.sleep(1000); int x = 10;
		 * System.exit(0); int y = x / 0; System.out.println(y); } catch
		 * (Exception e) { System.out.println(e); } finally {
		 * System.out.println("finally"); }
		 */

	}

}
