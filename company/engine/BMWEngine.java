package com.company.engine;

public class BMWEngine extends Engine {
    
    public BMWEngine(int capasity) {
        super(capasity);
    }

    @Override
    public void showInfo() {
        System.out.println("Це двигун від BMW "+ "моделі:" + ", об'єм:" + capacity);

    }
}
