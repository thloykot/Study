package com.company.engine;

public class BMWEngine extends Engine {

    public BMWEngine(int capasity) {
        super(capasity);
    }

    @Override
    public String toString() {
        return "двигун марки BMW, об'єм:" + capasity;
    }

}