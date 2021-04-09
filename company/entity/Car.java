package com.company.entity;


public abstract class Car {
    private String model;
    private int price;
    private Engine engine;

    public Car(Engine engine,String model,int price){
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    protected Car() {
    }

    public String getModel(){
        return model;
    };
    public int getPrice(){return price;}
    public Engine getEngine(){return engine;}

}