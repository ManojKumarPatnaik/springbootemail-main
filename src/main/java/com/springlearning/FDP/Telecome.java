package com.springlearning.FDP;

import java.util.Scanner;

public class Telecome {
    public Network getInstance(String type){
        if(type.equals("jio"))return new Jio();
        else if(type.equals("airtel"))return new Airtel();
        return new Vi();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        var next = scanner.next();
        var in = scanner.nextInt();
        Telecome telecome=new Telecome();
        Network network=telecome.getInstance(next);
        network.cost=network.getRate();
        network.bill(in);
    }
}
