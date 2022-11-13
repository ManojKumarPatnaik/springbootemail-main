package com.springlearning.rough;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class CompactableFeatures {
    private static final Object object =new Object();
    private static IntPredicate odd=(i)->i%2!=0;
    private static IntPredicate even=(i)->i%2==0;

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(()->CompactableFeatures.opeartion(odd));
        CompletableFuture.runAsync(()->CompactableFeatures.opeartion(even));
        Thread.sleep(10000);

    }
    public static void opeartion(IntPredicate cond){
        IntStream.rangeClosed(1,10).filter(cond).forEach(CompactableFeatures::excute);
    }
    public  static  void excute(int n){
        synchronized (object){
            try {
                System.out.println(Thread.currentThread().getName()+" : "+(n++));
                object.notify();
                object.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
