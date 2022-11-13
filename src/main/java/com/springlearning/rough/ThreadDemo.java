package com.springlearning.rough;

public class ThreadDemo implements Runnable {
    final Object object;

    public ThreadDemo(Object object) {
        this.object = object;
    }

    private static int i = 1;

    public static void main(String[] args) throws InterruptedException {
        Object ob = new Object();
        Runnable runnable = new ThreadDemo(ob);
        Runnable runnable1 = new ThreadDemo(ob);
        new Thread(runnable, "even").start();
        new Thread(runnable1, "odd").start();

    }


    @Override
    public void run() {
        while (i <= 10) {
            if (i % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " : " + (i++));
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (i % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + " : " + (i++));
                    object.notify();
                }
            }
        }
    }
}
