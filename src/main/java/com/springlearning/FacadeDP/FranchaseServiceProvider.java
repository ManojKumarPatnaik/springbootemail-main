package com.springlearning.FacadeDP;

public class FranchaseServiceProvider
{
    private Dominos dominos;
    private Kfc kfc;
    private McDonals mcDonals;
    public FranchaseServiceProvider(){
        dominos=new Dominos();
        kfc= new Kfc();
        mcDonals =new McDonals();
    }
    public void  getKFC(){
        kfc.getCost();
        kfc.getOption();
    }
    public void  getMcDonols(){
        mcDonals.getCost();
        mcDonals.getOption();
    }
    public void  getDominos(){
        dominos.getCost();
        dominos.getOption();
    }
}
