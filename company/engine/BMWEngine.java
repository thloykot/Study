package com.company.engine;

public class BMWEngine extends Engine {
    
    public BMWEngine(String model, int capasity) {
        super(model, capasity);
    }

    @Override
    public void showInfo() {
        System.out.println("Це двигун від BMW "+ "моделі:" + model +", об'єм:" + capacity);

    }
}
