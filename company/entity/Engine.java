package com.company.entity;


public abstract class Engine {

    private int capacity;
    private String model;

    public Engine(String model, int capasity) {
        this.model = model;
        this.capacity = capasity;
    }

    public void showInfo() {
        System.out.println("Модель:" + model + "\nОб'єм:" + capacity);
    }

    public abstract void showMark();
}
