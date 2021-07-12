package com.company.engine;

import com.company.car.Mark;

public abstract class Engine {

    private final int capasity;

    public Engine(int capasity) {
        this.capasity = capasity;
    }

    public int getCapasity() {
        return capasity;
    }

    public abstract Mark getMark();

    @Override
    public String toString() {
        return "Двигун Марки:" + getMark() + ". Об'єм:" + capasity;
    }
}