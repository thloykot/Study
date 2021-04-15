package com.company.engine;

public class VolkswagenEngine extends Engine {

    public VolkswagenEngine(int capasity) {
        super(capasity);
    }

    @Override
    public void showInfo() {
        System.out.println("Це двигун від Volkswagen " + "моделі:" + ", об'єм:" + capacity);
    }
}
