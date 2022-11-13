package com.springlearning.rough.DIP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        BankCard bankCard = new CreditCard();
        BankCard bankCard = new DebitCard();
        Shopping shopping=new Shopping(bankCard);
        shopping.doPurchase();
        CustomArrayList<Double> customArrayList=new CustomArrayList<>();
        customArrayList.add(1.0);
        customArrayList.add(1.0);
        customArrayList.add(1.0);
        customArrayList.add(2.0);

        System.out.println(customArrayList);

    }
}
class CustomArrayList<T> extends ArrayList<T>{
    @Override
    public boolean add(T object){
        if(this.contains(object))return true;
        else return super.add(object);
    }

}
