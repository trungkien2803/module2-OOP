package com.company;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int n = 3;
        System.out.println("2");
        while (n <= 100000) {
            int count = 0;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(n);
            }
            n++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thread 2 Finish in " + (endTime - startTime)/1000 + "s");
    }
}
