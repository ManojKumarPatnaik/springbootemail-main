package com.springlearning.random;

public class EvenOrOdd implements Runnable {
    Object object;
    int i;
    EvenOrOdd(Object object) {
        this.object = object;
        this.i = 0;

    }
    public Object getObject() {
        return object;
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        if(i% 2 == 0){
            synchronized (object) {
                System.out.println(Thread.currentThread().getName() + ": " + object.toString() +" "+i);
            }
            try {
                object.wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            synchronized (object) {
                System.out.println(Thread.currentThread().getName() + ": " + object.toString() + " " + i);
                i++;
                try {
                    object.notify();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
