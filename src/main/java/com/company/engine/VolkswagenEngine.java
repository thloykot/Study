package com.company.engine;

public class VolkswagenEngine extends Engine {

    public VolkswagenEngine(int capasity) {
        super(capasity);
    }

    @Override
    public String toString() {
        return "Це двигун від Volkswagen, об'єм:" + capasity;
    }

}