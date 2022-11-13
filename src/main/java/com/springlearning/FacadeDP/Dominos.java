package com.springlearning.FacadeDP;

public class Dominos implements Franchase{
    @Override
    public void getCost() {
        System.out.println("Dominos");
    }

    @Override
    public void getOption() {
        System.out.println("1,000,000,000");
    }
}
