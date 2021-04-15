package com.company.engine;


public class Engine {

    protected final int capacity;
    protected final String model;

    public Engine(String model, int capasity) {
        this.model = model;
        this.capacity = capasity;
    }

    public void showInfo() {
        System.out.println("Модель:" + model + "\nОб'єм:" + capacity);
    }

}
