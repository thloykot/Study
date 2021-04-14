package com.company.car;


import com.company.entity.Engine;

public abstract class Car {

    private final String model;
    private final int price;
    private final Engine engine;

    public Car(String model, int price, Engine engine) {
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void printInfo();

}