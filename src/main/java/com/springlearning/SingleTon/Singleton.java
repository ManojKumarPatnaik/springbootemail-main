package com.springlearning.SingleTon;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null)
//            synchronized {
             return new Singleton();

//        }
        else
         return singleton;
    }
}
