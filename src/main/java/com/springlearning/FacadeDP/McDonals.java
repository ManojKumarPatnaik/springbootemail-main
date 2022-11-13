package com.springlearning.FacadeDP;

public class McDonals implements Franchase{
    @Override
    public void getCost() {
        System.out.println("McDonals");
    }

    @Override
    public void getOption() {
        System.out.println("1,400,000,000");
    }
}
