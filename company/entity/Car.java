package com.company.entity;


public abstract class Car {
    private String model;
    public Car(String engine,String model,int price){
        this.model = model;
    };
    public String getModel(){
        return model;
    };

}