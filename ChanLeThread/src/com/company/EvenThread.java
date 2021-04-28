package com.company;

public class EvenThread implements Runnable{
    Thread thread = new Thread();
    public EvenThread(){
        thread = new Thread(this);
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i+=2){
                System.out.println(i);
            }
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
