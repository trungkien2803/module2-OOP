package com.company;

public class OddThread implements Runnable {
    Thread thread = new Thread();
    public OddThread(){
        thread = new Thread(this);
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i += 2) {
                System.out.println(i);
            }
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
