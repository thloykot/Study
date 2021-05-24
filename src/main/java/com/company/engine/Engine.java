package com.company.engine;


public abstract class Engine {

    protected final int capasity;

    public Engine(int capasity) {
        this.capasity = capasity;
    }

    public int getCapasity(){
        return capasity;
    }

}