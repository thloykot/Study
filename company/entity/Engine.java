package com.company.entity;


public abstract class Engine {

    protected int capacity;
    protected String model;

    public Engine(String model, int capasity) {
        this.model = model;
        this.capacity = capasity;
    }

    public void showInfo() {
        System.out.println("Модель:" + model + "\nОб'єм:" + capacity);
    }

}
