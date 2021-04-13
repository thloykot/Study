package com.company.engine;

import com.company.entity.Engine;

public class BMWEngine extends Engine {
    public BMWEngine(String model, int capasity) {
        super(model, capasity);
    }

    @Override
    public void showMark() {
        System.out.println("Це двигун від BMW, об'єм:");

    }
}
