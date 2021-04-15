package com.company.engine;


public abstract class Engine {

    protected final int capacity;

    public Engine(int capasity) {
        this.capacity = capasity;
    }

    public abstract void showInfo();

}
