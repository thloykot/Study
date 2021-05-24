package com.company.car;


import com.company.engine.Engine;

public abstract class Car {
    private final String model;
    private final int price;
    private final Engine engine;
    private final String color;

    public Car(String model, int price, Engine engine, String color) {
        this.model = model;
        this.price = price;
        this.engine = engine;
        this.color = color;

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

    public String getColor(){return color;}

    @Override
    public String toString() {
        return model + ", " + price + ", " + engine;
    }

}