package com.springlearning.rough.DIP;

public class Shopping {
    private  BankCard bankCard;
    Shopping(BankCard bankCard){
        this.bankCard=bankCard;
    }
    public void doPurchase(){
        bankCard.doTrasc();
        System.out.println("purchare");
    }
}
