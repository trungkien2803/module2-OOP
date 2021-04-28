package com.company;

public class Main {

    public static void main(String[] args) {
	OddThread oddThread = new OddThread();
	EvenThread evenThread = new EvenThread();

		try {
			oddThread.getThread().start();
			oddThread.getThread().join();
			evenThread.getThread().start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

    }
}
