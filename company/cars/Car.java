package com.company.cars;


import com.company.entity.Engine;

public class Car {
    private String model;
    private int price;
    private Engine engine;

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

}