package com.company.entity;


public abstract class Engine {

    private int capasity;

    public void showCapasity(){
        System.out.println(capasity);
    }

    public void setCapasity(int capasity){
        this.capasity = capasity;
    }

    public abstract void showInfo();
}
