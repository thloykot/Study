package com.company.entity;


public abstract class Engine {

    public int capasity;
    public String model;

    public Engine(String model,int capasity){
        this.model = model;
        this.capasity = capasity;
    }

    public void showInfo(){
        System.out.println("Модель:" + model + "\nОб'єм:" + capasity);
    }

    public abstract void showMark();
}
