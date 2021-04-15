package com.company.engine;


public abstract class Engine {

    protected final int capacity;
    protected final String model;

    public Engine(String model, int capasity) {
        this.model = model;
        this.capacity = capasity;
    }

    public abstract void showInfo();

}
