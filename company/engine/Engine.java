package com.company.engine;


public abstract class Engine {

    protected int capacity;

    public void setCapacity(int capasity) {
        this.capacity = capasity;
    }

    public abstract void showInfo();

}
