package com.springlearning.FDP;

public abstract class Network {
    double cost;
    public   abstract int  getRate();
    public void bill(int m){
        System.out.println(m*cost);
    }
}
