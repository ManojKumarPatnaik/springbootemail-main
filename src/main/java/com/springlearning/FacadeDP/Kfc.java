package com.springlearning.FacadeDP;

public class Kfc implements Franchase{
    @Override
    public void getCost() {
        System.out.println("Kfc");
    }

    @Override
    public void getOption() {
        System.out.println("1,200,000,000");
    }
}
