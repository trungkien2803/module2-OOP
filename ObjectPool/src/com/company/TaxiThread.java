package com.company;

import java.time.temporal.TemporalUnit;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TaxiThread implements Runnable {
    private TaxiPool taxiPool;

    public TaxiThread(TaxiPool taxiPool) {
        this.taxiPool = taxiPool;
    }

    @Override
    public void run() {
        try {
            takeATaxi();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TaxiNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void takeATaxi() throws InterruptedException, TaxiNotFoundException {
        System.out.println("New Client" + Thread.currentThread().getName());
        Taxi taxi = taxiPool.getTaxi();
        TimeUnit.MICROSECONDS.sleep(randInt(1000, 1500));
        taxiPool.release(taxi);
        System.out.println("Served the client: " + Thread.currentThread().getName());
    }

    private int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
