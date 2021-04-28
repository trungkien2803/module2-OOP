package com.company;

public class Main {

    public static void main(String[] args) {
	    NumberGenerator numberGenerator1 = new NumberGenerator();
	    NumberGenerator numberGenerator2 = new NumberGenerator();
	    numberGenerator1.getThread().setPriority(Thread.MIN_PRIORITY);
		numberGenerator2.getThread().setPriority(Thread.MAX_PRIORITY);
		numberGenerator1.getThread().start();
		numberGenerator2.getThread().start();

    }
}
