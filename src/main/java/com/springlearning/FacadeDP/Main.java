package com.springlearning.FacadeDP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        FranchaseServiceProvider franchaseServiceProvider=new FranchaseServiceProvider();
        String v=scanner.next();
        if(v.equals("kfc")){
            franchaseServiceProvider.getKFC();
        }else if(v.equals("dominos"))franchaseServiceProvider.getDominos();
        else franchaseServiceProvider.getMcDonols();
    }
}
