package com.company.engine;

import com.company.entity.Engine;

public class VolkswagenEngine extends Engine {

    public VolkswagenEngine(String model, int capasity) {
        super(model, capasity);
    }

    @Override
    public void showInfo() {
        System.out.println("Це двигун від Volkswagen "+ "моделі:" + model +", об'єм:" + capacity);
    }
}
