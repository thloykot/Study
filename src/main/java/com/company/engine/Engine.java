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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (o instanceof Engine) {
            Engine engine = (Engine) o;

            return capasity == engine.capasity;
        }
        return false;
    }
}