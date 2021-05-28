package com.company.engine;

public class VolkswagenEngine extends Engine {

    public VolkswagenEngine(int capasity) {
        super(capasity);
    }

    @Override
    public String toString() {
        return "Двигун марки Volkswagen, об'єм:" + capasity;
    }

}