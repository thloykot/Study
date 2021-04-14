package com.company.engine;

import com.company.entity.Engine;

public class MercedesEngine extends Engine {

    public MercedesEngine(String model, int capasity) {
        super(model, capasity);
    }

    @Override
    public void showInfo() {
        System.out.println("Це двигун від Mercedes "+ "моделі:" + model +", об'єм:" + capacity);
    }
}


