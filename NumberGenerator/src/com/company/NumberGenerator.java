package com.company;

public class NumberGenerator implements Runnable {
    private Thread thread;
    public NumberGenerator(){
        thread = new Thread(this);
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
