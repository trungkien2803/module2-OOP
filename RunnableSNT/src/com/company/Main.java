package com.company;

public class Main {

    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        Thread thread1 = new Thread(lazyPrimeFactorization);
//        thread1.start();
        OptimizedPrimeFactorization optimizedPrimeFactorization =new OptimizedPrimeFactorization();
        Thread thread2 = new Thread(optimizedPrimeFactorization);
        thread2.start();
    }
}
